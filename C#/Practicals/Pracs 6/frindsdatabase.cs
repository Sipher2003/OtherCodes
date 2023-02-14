using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Data;

namespace WebApplication14
{
    public partial class form : System.Web.UI.Page
    {
        SqlConnection con = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\hp\source\repos\WebApplication14\WebApplication14\App_Data\Database1.mdf;Integrated Security=True");
        protected void Page_Load(object sender, EventArgs e)
        {
        }
        protected void Button1_Click(object sender, EventArgs e)
        {
           
            string query = "insert into friendinfo values('"+TextBox1.Text+"','"+TextBox2.Text+"','"+TextBox3.Text+"','"+Calendar1.SelectedDate.ToString()+"')";
            SqlCommand cmd = new SqlCommand(query, con);
            con.Open();
            int i = cmd.ExecuteNonQuery();
            con.Close();
            if (i > 0)
            {
                Response.Write("1 record inserted");
                TextBox1.Text = "";
                TextBox2.Text = "";
                TextBox3.Text = "";
               
                
            }
            else
            {
                Response.Write("0 record inserted");

            }


        }


        protected void Button2_Click(object sender, EventArgs e)
        {
            string q = "delete from friendinfo where Id=1";
            SqlCommand cmd = new SqlCommand(q, con);
            con.Open();
            int i = cmd.ExecuteNonQuery();
            con.Close();
            if (i > 0)
            {
                Response.Write("1 record deleted");
                TextBox1.Text = "";
                TextBox2.Text = "";
                TextBox3.Text = "";


            }
            else
            {
                Response.Write("0 record deleted");

            }

        }


    }
}



/*
<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="form.aspx.cs" Inherits="WebApplication14.form" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:Label ID="Label1" runat="server" Text="Name"></asp:Label>
            <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
            <br />
            <br />
            <br />
            <asp:Label ID="Label2" runat="server" Text="Nick Name"></asp:Label>
            <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
            <br />
            <br />
            <br />
            <asp:Label ID="Label4" runat="server" Text="Mobile No."></asp:Label>
            <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox>
            <br />
            <br />
            <br />
            <asp:Label ID="Label3" runat="server" Text="DOB"></asp:Label>
            <br />
            <asp:Calendar ID="Calendar1" runat="server"></asp:Calendar>
            <br />
            <br />
            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Add" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:Button ID="Button2" runat="server" OnClick="Button2_Click" Text="Delete" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:Button ID="Button3" runat="server" Text="Reset" />
        </div>
    </form>
</body>
</html>


*/