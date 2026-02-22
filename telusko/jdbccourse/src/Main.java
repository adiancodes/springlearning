import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        import the package
        loa and register
        create connection
        [three things url user and password as postgre is network based database]

        create statement
        execute statement
        process and result
        close
         */
        String url = "jdbc:postgresql://localhost:5432/demo1";
        String uname = "postgres"; //for dbms
        String pass = "Sarya_12";  //for dbms
        //query to statemet
//        String sql = "Select sname from student where sid = 1";
        //String sql = "select * from student"; //to view multiple


        Connection con = DriverManager.getConnection(url,uname,pass);
        //

        System.out.println("Connected to PostgreSQL");

        //create a statement

        Statement st = con.createStatement();

        //execute statement

        //ResultSet rs = st.executeQuery(sql); // st.executeQuery
//        System.out.println(rs.next());//if we are able to get the datta we will get data or next row from running query true else we will get false

        //in order to pint the data
        //instead of doing the rs.next we can use rs.getString
//we need to use rs.next() as it placed the pointer to the next data

//        System.out.println(rs.getString("sname"));


        //for multiple rows
//        ResultSet rs = st.executeQuery(sql);
//        while (rs.next()){
//            //this loop will run till i have data
//            //first it will check do i have a next row
//            //if yes then jump to next row
//            System.out.print(rs.getInt(1) + "-");
//            System.out.print(rs.getString(2) + "-");
//            System.out.print(rs.getInt(3));
//            System.out.println(" ");
//
//        }

        //for create
//        String sql = " insert into student values (5, 'john' , 48) ";
//        boolean status = st.execute(sql);
//        System.out.println(status);


        //for update

//        String sql = " update student set sname = 'harsh' where sname = 'john' ";
//
//        st.executeUpdate(sql);

//for delete
//        String sql = "delete from student where sid = 5";
//        st.execute(sql);
        //
         //how to do prepared statement means how to insert a value taken from the user
        int sid = 11;
        String sname = "alpha";
        int marks = 90;

        //i cant do
//        String sql = "insert into student values( sid , name , marks)" ;
        //we need to concatinate
//        String sql = "insert into student values (" + sid + ", '" + sname + "'," + marks + ")";
//        st.execute(sql);
//first we need to not use double quotes and stuff
        //2nd we need to stop sql injections
        //3rd we need to increase performance
        //cached query  means you dont need to run a same query everytime we can cache it using prepared statement
        String sql = "insert into student values(?,?,?)";
        //we will use prepared statement
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt( 1 , sid);
        ps.setString( 2 , sname);
        ps.setInt( 3 , marks);
        ps.execute();




        con.close();
        System.out.println("connection is closed");




    }
}