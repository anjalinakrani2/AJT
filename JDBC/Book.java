import java.sql.*;



class Book
{
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String DATABASE_NAME = "mydatabase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "ANJALI21";
    public static void main(String[] args) throws ClassNotFoundException {
        Connection conn = null;

        try  
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL + DATABASE_NAME, USERNAME, PASSWORD);

            createTable(conn);

            insertBook(conn,1, "Java", "xyz", 200);
            insertBook(conn,2,"data mining","abc",499.99);

            viewBooks(conn);

            updateBookTitle(conn, 1, "Advance java");

            updatePrice(conn, 2, 600);
            createIncreasePriceProcedure(conn);
            increasePrice(conn);

            viewBooks(conn);

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
        finally
        {
            try
            {
                if(conn!=null) conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }


    public static void createTable(Connection conn) throws Exception
    {
        String drop="DROP TABLE IF EXISTS book";
        String createTableQuery="CREATE TABLE book (bookId INT PRIMARY KEY,Title VARCHAR(100),Author VARCHAR(100),Price DOUBLE )";

        Statement stmt=null;
        try
        {
            stmt=conn.createStatement();
            stmt.execute(drop);
            stmt.execute(createTableQuery);
            System.out.println("Book table created successfully!");
        }
        catch(Exception e)
        {
            System.out.println("Error creating book table : " +e.getMessage());
        }
        finally
        {
            try
            {
                if(stmt!=null) stmt.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void insertBook(Connection conn,int bookId,String Title,String Author,double price)
    {
        String insertQuery="INSERT INTO BOOK (bookId,Title,Author,price) values (?,?,?,?)";
        PreparedStatement pstmt=null;
        try
        {
            pstmt=conn.prepareStatement(insertQuery);
            pstmt.setInt(1, bookId);
            pstmt.setString(2, Title);
            pstmt.setString(3, Author);
            pstmt.setDouble(4, price);
            pstmt.executeUpdate();
            System.out.println("Book inserted successfully.");
        }
        catch(Exception e)
        {
            System.out.println("Error inserting book : "+e.getMessage());
        }
        finally
        {
            try
            {
                if(pstmt!=null) pstmt.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void updateBookTitle(Connection conn,int bookId,String Title)
    {
        String updateQuery="UPDATE BOOK SET Title=? WHERE bookId=?";
        PreparedStatement pstmt=null;
        try
        {
            pstmt=conn.prepareStatement(updateQuery);
            pstmt.setInt(2, bookId);
            pstmt.setString(1, Title);
            pstmt.executeUpdate();
            System.out.println("Book Title updated successfully.");
        }
        catch(Exception e)
        {
            System.out.println("Error updating book title : "+e.getMessage());
        }
        finally
        {
            try
            {
                if(pstmt!=null) pstmt.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void updatePrice(Connection conn,int bookId,double price)
    {
        String updateQuery="UPDATE BOOK SET price=? WHERE bookId=?";
        PreparedStatement pstmt=null;
        try
        {
            pstmt=conn.prepareStatement(updateQuery);
            pstmt.setInt(2, bookId);
            pstmt.setDouble(1, price);
            pstmt.executeUpdate();
            System.out.println("Book price updated successfully.");
        }
        catch(Exception e)
        {
            System.out.println("Error updating price of the book : "+e.getMessage());
        }
        finally
        {
            try
            {
                if(pstmt!=null) pstmt.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void deleteBook(Connection conn,int bookId)
    {
        String deleteQuery="DELETE FROM BOOK WHERE bookId=?";
        PreparedStatement pstmt=null;
        try
        {
            pstmt=conn.prepareStatement(deleteQuery);
            pstmt.setInt(1, bookId);
            pstmt.executeUpdate();
            System.out.println("Successfully deleted book with bookId : "+bookId);
        }
        catch(Exception e)
        {
            System.out.println("Error deleting book : "+e.getMessage());
        }
        finally
        {
            try
            {
                if(pstmt!=null) pstmt.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void viewBooks(Connection conn) throws Exception
    {
        String query="SELECT * FROM BOOK";
        Statement stmt=null;
        ResultSet rs=null;
        try
        {
            stmt=conn.createStatement();
            rs=stmt.executeQuery(query);

            while(rs.next())
            {
                int bookId=rs.getInt("bookId");
                String Title=rs.getString("Title");
                String Author=rs.getString("Author");
                Double price=rs.getDouble("price");

                System.out.println("Book id : "+bookId+" Title : "+Title+" Author : "+Author+" price : "+price);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error fetching data : "+e.getMessage());
        }
        finally
        {
            try
            {
                if(stmt!=null) stmt.close();
                if(rs!=null) rs.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }


    public static void createIncreasePriceProcedure(Connection conn)
    {


        String procedure="CREATE PROCEDURE INCREASEPRICE() "+
                        "BEGIN "+
                        "UPDATE BOOK SET PRICE=PRICE*1.1 WHERE PRICE>500;"+
                        "UPDATE BOOK SET PRICE=PRICE*1.05 WHERE PRICE<=500;"+
                        "END;";
        
        Statement stmt=null;
        try
        {
            stmt=conn.createStatement();
            stmt.execute(procedure);
            System.out.println("Procedure created successfully!");
        }
        catch(Exception e)
        {
            System.out.println("Error creating procedure : "+e.getMessage());
        }
        finally
        {
            try
            {
                if(stmt!=null) stmt.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void increasePrice(Connection conn)
    {
        CallableStatement cstmt=null;

        try
        {
            cstmt=conn.prepareCall("{CALL INCREASEPRICE()}");
            cstmt.execute();
            System.out.println("Price updated using procedure");
        }
        catch(Exception e)
        {
            System.out.println("Error calling procedure : "+e.getMessage());
        }
        finally
        {
            try
            {
                if(cstmt!=null) cstmt.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    
}
