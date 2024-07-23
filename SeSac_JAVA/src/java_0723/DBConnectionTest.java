package java_0723;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class DBConnectionTest {
    private Connection conn;

    @BeforeEach
    void init() throws IOException {
        DBConnection db = new DBConnection();
        this.conn = db.getConnection();
    }

    @Test
    void getConnection() {
        assertNotNull(this.conn);
    }

    @AfterEach
    void closd() throws SQLException {
        DBClose.dbClose(this.conn);
    }
}