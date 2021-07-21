import java.util.StringJoiner;

public class StringBuilferDemo1 {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = bulidInsertSql(table,fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");

        String[] fields1 = { "name", "position", "salary" };
        String table1 = "employee";
        String select = buildSelectSql(table1, fields1);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
    }

    private static String buildSelectSql(String table1, String[] fields1) {
        StringJoiner sj = new StringJoiner(", ","SELECT "," FROM "+table1);
        for (String field:fields1){
            sj.add(field);

        }
        return sj.toString();
    }

    private static String bulidInsertSql(String table, String[] fields) {
        StringBuilder insert = new StringBuilder("INSERT INTO ");
        insert.append(table+" (");
        for (int i =0;i<fields.length;i++){
            if (i==fields.length-1){insert.append(fields[i]);break;}
            insert.append(fields[i]+", ");
        }
        insert.append(") VALUES (?, ?, ?)");
        return insert.toString();

    }
}
