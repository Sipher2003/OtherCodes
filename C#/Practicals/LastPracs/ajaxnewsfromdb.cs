// aspx code 

// <%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm5.aspx.cs" Inherits="WebApplication13.WebForm5" %>

// <!DOCTYPE html>

// <html xmlns="http://www.w3.org/1999/xhtml">
// <head runat="server">
//     <title></title>
// </head>
// <body>
//     <form id="form1" runat="server">
//         <div>
//             <asp:Label ID="Label1" runat="server" Font-Bold="True" Text="Times of India"></asp:Label>
//             <br />
//             <asp:ScriptManager ID="ScriptManager1" runat="server">
//             </asp:ScriptManager>
//             <br />
//             <asp:UpdatePanel ID="UpdatePanel1" runat="server">
//                 <ContentTemplate>
//                     <asp:Label ID="Label2" runat="server" ForeColor="Red" Text="Breaking News"></asp:Label>
//                     &nbsp;&nbsp;
                     
//                     <asp:Label ID="Label3" runat="server"></asp:Label>
                     
//                     <br />
//                     <br />
//                     <asp:Button ID="Button1" runat="server" Text="Button" OnClick="Button1_Click" />
//                     <br />
// <br />
//                     <asp:UpdateProgress runat="server">

//                         <ProgressTEmplate>
//                             Loading ....
//                         </ProgressTEmplate>
//                     </asp:UpdateProgress>
//                 </ContentTemplate>
//             </asp:UpdatePanel>
//             <br />
//             <br />
//             <br />
//             <br />
//         </div>
//     </form>
// </body>
// </html>


// C# code
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication13
{
    public partial class WebForm5 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            System.Threading.Thread.Sleep(5000);
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\hp\source\repos\WebApplication13\WebApplication13\App_Data\Database1.mdf;Integrated Security=True");
            con.Open();
            String str = "select * from [Table]";
            SqlCommand com= new SqlCommand(str, con);
            SqlDataReader dr= com.ExecuteReader();
            while (dr.Read())
            {
                Label3.Text += dr[1].ToString() + "<br>";

            }
            dr.Close();
            con.Close();

        }
    }
}


// sql code
// CREATE TABLE [dbo].[Table]
// (
// 	[Id] INT NOT NULL PRIMARY KEY IDENTITY, 
//     [News] VARCHAR(50) NOT NULL
// )
