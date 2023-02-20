using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication17
{
    public partial class calendarform : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }


        protected void Calendar1_DayRender(object sender, DayRenderEventArgs e)
        {
            if (e.Day.Date.Day == 5 && e.Day.Date.Month == 9)
            {
                e.Cell.BackColor = System.Drawing.Color.Yellow;
                Label lbl = new Label();
                lbl.Text = "<br>Teachers Day";
                e.Cell.Controls.Add(lbl);
                Image img = new Image();
                img.ImageUrl = "teacher.jpg";
                img.Width = 20;
                img.Height = 20;
                e.Cell.Controls.Add(img);

            }

            if((e.Day.Date>=new DateTime(2023,11,23)) && (e.Day.Date<=new DateTime(2023, 11, 30)))
            {
                Label lbl1 = new Label();
                lbl1.Text = "<br>Diwali";
                e.Cell.Controls.Add(lbl1);
                e.Cell.BackColor = System.Drawing.Color.Orange;
                e.Cell.BorderColor = System.Drawing.Color.Black;
                e.Cell.BorderWidth = new Unit(3);
            }

            Label1.Text = Calendar1.SelectedDate.ToString();
            Label2.Text = DateTime.Now.ToString();


            Label3.Text = (Calendar1.SelectedDate - Calendar2.SelectedDate).Days.ToString();
        }
    }
}


/*
<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="calendarform.aspx.cs" Inherits="WebApplication17.calendarform" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <br />
            <asp:Calendar ID="Calendar1" runat="server" OnDayRender="Calendar1_DayRender"  Width="661px"></asp:Calendar>
            <br />
            <br />
            <asp:Label ID="Label1" runat="server" Text="Label"></asp:Label>
            <br />
            <br />
            <br />
            <asp:Label ID="Label2" runat="server" Text="Label"></asp:Label>
            <br />
            <br />
            <br />
            <asp:Calendar ID="Calendar2" runat="server"></asp:Calendar>
            <br />
            <br />
            <br />
            <asp:Label ID="Label3" runat="server" Text="Label"></asp:Label>
            <br />
            <br />
            <br />
            <br />
            <br />
            <br />
            <br />
            <br />
            <br />
            <br />
        </div>
        <p>
            <br />
        </p>
        <p>
            &nbsp;</p>
        <p>
            &nbsp;</p>
        <p>
            &nbsp;</p>
        <p>
            &nbsp;</p>
        <p>
            &nbsp;</p>
        <p>
            &nbsp;</p>
        <p>
            &nbsp;</p>
        <p>
            &nbsp;</p>
        <p>
            &nbsp;</p>
        <p>
            &nbsp;</p>
    </form>
</body>
</html>

*/