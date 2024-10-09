/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.config.DriverConfigLoader;
import com.datastax.oss.driver.api.core.config.DriverOption;

import java.net.InetSocketAddress;
/**
 *
 * @author ADMIN
 */
public class ConnectCassandra {
    public static CqlSession createSession() {
        // Tạo phiên kết nối với tên người dùng và mật khẩu
        return CqlSession.builder()
                    .withKeyspace("BHSP") // Chỉ định keyspace
                .addContactPoint(new InetSocketAddress("127.0.0.1", 9042)) // Điểm liên hệ
                .withLocalDatacenter("datacenter1") // Chỉ định datacenter
                .withAuthCredentials("cassandra", "cassandra") // Tên người dùng và mật khẩu
                .build();   
    }
}
