databaseChangeLog = {
	
	changeSet(author: "kevin", id: "create table user") {
		createTable(tableName: "user") {
			column(autoIncrement: "true", name: "id", type: "BIGINT") {
					 constraints(primaryKey: "true")
			}
			column(name: "version", type: "BIGINT") {
					 constraints(nullable: "false")
			}
			
			column(name: "login_name", type: "VARCHAR(128)")
			column(name: "password_hash", type: "VARCHAR(255)")
			column(name: "name", type: "VARCHAR(255)")
			column(name: "img", type: "VARCHAR(255)")
			column(name: "email", type: "VARCHAR(255)")			
			column(name: "phone", type: "VARCHAR(255)")			
			column(name: "date_created", type: "DATETIME")
			column(name: "last_updated", type: "DATETIME")
			column(name: "create_user", type: "INT(11)")
			column(name: "update_user", type: "INT(11)")
		}
	}

}
