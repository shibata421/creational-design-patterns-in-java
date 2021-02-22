package br.com.cod3r.factory.app.dbadapter.factory;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.db.OracleDB;
import br.com.cod3r.factory.app.dbadapter.db.PostgresDB;

public class DBFactory {
	public static DB getDatabase(String dbType) {
		DB db = null;
		
		if("oracle".equalsIgnoreCase(dbType)) {
			db = new OracleDB();
		} else if ("postgres".equalsIgnoreCase(dbType)) {
			db = new PostgresDB();
		}
		
		return db;
	}
}
