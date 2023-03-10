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

        protected void RadioButton1_CheckedChanged(object sender, EventArgs e)
        {
            DropDownList1.Items.Clear();
            DropDownList1.Items.Add("inox");
            DropDownList1.Items.Add("Pvr");
        }

        protected void RadioButton2_CheckedChanged(object sender, EventArgs e)
        {
            DropDownList1.Items.Clear();
            DropDownList1.Items.Add("Cinepolis");
            DropDownList1.Items.Add("Ashokaa");
        }

        protected void DropDownList1_SelectedIndexChanged(object sender, EventArgs e)
        {

           if (DropDownList1.SelectedValue== "inox")
            {
                Label2.Text ="RRR";
                //Not over yet
            }

            if (DropDownList1.SelectedValue=="Pvr")
            {
                Label2.Text = "Avatar";
                //Not over yet
            }
            if (DropDownList1.SelectedValue=="Cinepolis")
            {
                Label2.Text = "Avatar22";
                //Not over yet

            }
            if (DropDownList1.SelectedValue=="Ashokaa")
            {
                Label2.Text = "Batman";
                //Not over yet
            }
        }

    }
}


/*

<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="WebApplication5.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
       
        <asp:Label ID="Label1" runat="server" Text="City"></asp:Label>
        <br />
        <br />
        <asp:RadioButton ID="RadioButton1" runat="server" Text="Mumbai" GroupName="City" OnCheckedChanged="RadioButton1_CheckedChanged" AutoPostBack="true"/>
        <br />
        <br />
        <asp:RadioButton ID="RadioButton2" runat="server" GroupName="City" Text="Pune" OnCheckedChanged="RadioButton2_CheckedChanged" AutoPostBack="True" />
        <br />
        <br />
        <asp:DropDownList ID="DropDownList1" runat="server" OnSelectedIndexChanged="DropDownList1_SelectedIndexChanged" AutoPostBack="True">
        </asp:DropDownList>
        <br />
        <br />
        <asp:Label ID="Label2" runat="server"></asp:Label>
        <br />
       
    </form>
</body>
</html>



*/
