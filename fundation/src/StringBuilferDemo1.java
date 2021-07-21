public class StringBuilferDemo1 {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = bulidInsertSql(table,fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
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
