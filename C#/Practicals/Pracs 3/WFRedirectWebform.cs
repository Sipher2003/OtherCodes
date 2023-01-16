using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication5
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            String uname = "Admin";
            String pass = "admin";


            if(TextBox1.Text==uname && TextBox2.Text == pass)
            {
                Response.Redirect("home page.aspx");
            }
            if(TextBox1.Text != uname || TextBox2.Text != pass)
            {
                Response.Redirect("other code.aspx");

            }
        }
    }
}


/* html code

Login page
<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="WebApplication5.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <asp:Label ID="Label1" runat="server" Text="Login page"></asp:Label>
        <br />
        <br />
        <asp:Label ID="Label2" runat="server" Text="usrname"></asp:Label>
        <asp:TextBox ID="TextBox1" runat="server" style="margin-left: 35px"></asp:TextBox>
        <br />
        <br />
        <asp:Label ID="Label3" runat="server" Text="psswrd"></asp:Label>
        <asp:TextBox ID="TextBox2" runat="server" style="margin-left: 36px" TextMode="Password"></asp:TextBox>
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="submit" />
        <br />
        <br />
        <br />
    </form>
</body>
</html>



homepage html(aspx)
<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="home page.aspx.cs" Inherits="WebApplication5.home_page" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h1>Home page</h1>
        </div>
    </form>
</body>
</html>


errorpage html(aspx)
<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="other code.aspx.cs" Inherits="WebApplication5.other_code" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h1>Error Page</h1>
        </div>
    </form>
</body>
</html>


*/