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
            Label2.Text = TextBox1.Text;
            if (RadioButton1.Checked)
            {
                Label2.ForeColor = System.Drawing.Color.Blue;
            }
            if (RadioButton2.Checked)
            {
                Label2.ForeColor = System.Drawing.Color.Red;
            }
            if (RadioButton3.Checked)
            {
                Label2.ForeColor = System.Drawing.Color.Green;
            }

            if (CheckBox1.Checked)
            {
                Label2.Font.Bold = true;
            }
            else
            {
                Label2.Font.Bold = false;
            }

            if (CheckBox2.Checked)
            {
                Label2.Font.Italic = true;
            }
            else
            {
                Label2.Font.Italic = false;
            }

            if (CheckBox3.Checked)
            {
                Label2.Font.Underline = true;
            }
            else
            {
                Label2.Font.Underline = false;
            }
        }
    }
}


/*html code 
<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="WebApplication5.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:Label ID="Label1" runat="server" Text="Name"></asp:Label>
            <asp:TextBox ID="TextBox1" runat="server" style="margin-left: 27px; margin-top: 6px"></asp:TextBox>
            <br />
            <br />
            <asp:Label ID="Label2" runat="server"></asp:Label>
            <br />
            <br />
            <br />
        </div>
        <asp:CheckBox ID="CheckBox1" runat="server" Text="Bold" />
        <br />
        <asp:CheckBox ID="CheckBox2" runat="server" Text="Italic" />
        <br />
        <asp:CheckBox ID="CheckBox3" runat="server" Text="Underlined" />
        <br />
        <br />
        <asp:RadioButton ID="RadioButton1" runat="server" Text="Blue" GroupName="Color"/>
        <br />
        <asp:RadioButton ID="RadioButton2" runat="server" Text="Red" GroupName="Color"/>
        <br />
        <asp:RadioButton ID="RadioButton3" runat="server" Text="Green" GroupName="Color" />
        <br />
        <br />
        <asp:Button ID="Button1" runat="server" Text="Submit" OnClick="Button1_Click" />
        <br />
    </form>
</body>
</html> */
