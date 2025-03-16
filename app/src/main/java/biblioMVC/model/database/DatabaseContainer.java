package biblioMVC.model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arthur de Souza Manske
 */
public class DatabaseContainer implements AutoCloseable {
    private boolean initialized = false;
    
    private final String path;
    private Connection sqlConn;
    
    public DatabaseContainer(String path)
    {
        this.path = path;
    }
    
    @Override public void close()
    {
        if (this.sqlConn != null) {
            try {
                this.sqlConn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseContainer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        this.initialized = false;        
    }
    
    public class DatabaseOperation implements AutoCloseable
    {        
        private PreparedStatement statement;
        private ResultSet         rs;
        
        private String            error;
        
        public DatabaseOperation(DatabaseContainer father, String sql)
        {
            this.rs = null;
            this.error = null;
            this.statement = null;
            
            try {
                this.statement = father.sqlConn.prepareStatement(sql);
            } catch (SQLException e) {
                this.error     = e.getMessage();
                this.statement = null;
            }
        }
        
        @Override public void close()
        {
           try {
                if (this.rs != null) this.rs.close();
                if (this.statement != null) this.statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseContainer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public int execute(Object... args)
        {
            this.error = null;
            
            try {
                for (int i = 0; i < args.length; ++i)
                    this.statement.setObject(i + 1, args[i]);
            
                this.statement.execute();
                this.rs = this.statement.getResultSet();
                
                return 0;
            } catch (SQLException e) {
                this.error = e.getLocalizedMessage();
                return -1;
            }
        }
        
        public boolean nextResult()
        {
            this.error = null;
            
            try {
                return this.rs.next();
            } catch (SQLException e) {
                this.error = e.getLocalizedMessage();
                return false;
            }
        }
        
        public int getInt(String column)
        {
            this.error = null;
            
            try {
                return this.rs.getInt(column);
            } catch (SQLException e) {
                this.error = e.getLocalizedMessage();
                return -1;
            }
        }
        
        public short getShort(String column)
        {
            this.error = null;
            
            try {
                return this.rs.getShort(column);
            } catch (SQLException e) {
                this.error = e.getLocalizedMessage();
                return -1;
            }
        }
        
        public long getLong(String column)
        {
            this.error = null;

            try {
                return this.rs.getLong(column);
            } catch (SQLException e) {
                this.error = e.getLocalizedMessage();
                return -1;
            }
        }
        
        public double getDouble(String column)
        {
            this.error = null;
            
            try {
                return this.rs.getDouble(column);
            } catch (SQLException e) {
                this.error = e.getLocalizedMessage();
                return Double.NEGATIVE_INFINITY;
            }
        }
        
        public float getFloat(String column)
        {
            this.error = null;

            try {
                return this.rs.getFloat(column);
            } catch (SQLException e) {
                this.error = e.getLocalizedMessage();
                return Float.NEGATIVE_INFINITY;
            }
        }
        
        public String getString(String column)
        {
            this.error = null;

            try {
                return this.rs.getString(column);
            } catch (SQLException e) {
                this.error = e.getLocalizedMessage();
                return null;
            }
        }
        
        public Date getDate(String column)
        {
            this.error = null;

            try {
                return this.rs.getDate(column);
            } catch (SQLException e) {
                this.error = e.getLocalizedMessage();
                return null;
            }
        }
        
        public String getError()
        {
            return this.error;
        }
    };
    
    public String initialize()
    {
        final var sql = """
        CREATE TABLE IF NOT EXISTS books (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            title TEXT NOT NULL UNIQUE,
            author TEXT NOT NULL,
            releaseDate DATE NOT NULL
        );""";
        
        if (this.initialized) return null;
        
        try {
           this.sqlConn = DriverManager.getConnection(path); 
        } catch (SQLException e) {
           return "ERR:DatabaseContainer::initialize(): " + e.getLocalizedMessage();
        }
                
        try (var statement = this.sqlConn.createStatement()) {
            statement.execute(sql);
        } catch (SQLException e) {            
            return "ERR:DatabaseContainer::initialize(): " + e.getLocalizedMessage();
        }
        
        this.initialized = true;
        return null;
    }
    
    public DatabaseContainer.DatabaseOperation execute(String sql, Object... args) {
        final var databaseOperation = new DatabaseOperation(this, sql);
        if (databaseOperation.getError() != null) return databaseOperation;
        
        databaseOperation.execute(args);
        return databaseOperation;
    }
        
    public boolean isInitialized()
    {
        return this.initialized;
    }
    
    public PreparedStatement prepareStatement(String sql) throws SQLException
    {
       return this.sqlConn.prepareStatement(sql);
    }
};