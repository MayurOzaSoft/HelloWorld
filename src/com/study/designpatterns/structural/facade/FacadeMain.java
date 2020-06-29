package com.study.designpatterns.structural.facade;

public class FacadeMain {
    public static void main(String[] args) {
        String tableName="Employee";

        // generating MySql HTML report and Oracle PDF report without using Facade
        Connection mySqlDBConnection = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, mySqlDBConnection);

        Connection oracleDBConnection = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, oracleDBConnection);

        // generating MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(DBTypes.MYSQL, ReportTypes.HTML, tableName);
        HelperFacade.generateReport(DBTypes.ORACLE, ReportTypes.PDF, tableName);
    }
}
