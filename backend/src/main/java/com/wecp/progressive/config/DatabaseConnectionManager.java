package com.wecp.progressive.config;

import java.util.Properties;
import java.util.*;
import java.sql.*;
import java.io.*;

public class DatabaseConnectionManager {
    private static final Properties properties= new Properties();
    static {
        loadProperties();
    }
    public static void loadProperties(){
        try(InputStream input=DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties")){
            if(input == null){
                throw new IllegalStateException("resource.propertiesnot found in classpath");
            }
            properties.load(input);
        }catch(IOException e){
            throw new RuntimeException("Error loading properties file",e);
        }
    }
    public static Connection getConnection() throws SQLException{
        String url=properties.getProperty("spring.datasource.url");
        String user= properties.getProperty("spring.datasource.username");
        String password= properties.getProperty("spring.datasource.password");
        return DriverManager.getConnection(url,user,password);
    }

}