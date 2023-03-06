 //Wf1.aspx code
//  <%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="WebApplication13.WebForm1" %>

// <!DOCTYPE html>

// <html xmlns="http://www.w3.org/1999/xhtml">
// <head runat="server">
//     <title></title>
// </head>
// <body>
//     <form id="form1" runat="server">
//         <div>
//             <br />
//             <br />
//             <asp:Label ID="Label1" runat="server" Text="Name"></asp:Label>
// &nbsp;
//             <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
//             <br />
//             <br />
//             <br />
//             <asp:Label ID="Label2" runat="server" Text="Age"></asp:Label>
//             <asp:TextBox ID="TextBox2" runat="server" style="margin-left: 22px"></asp:TextBox>
//             <br />
//             <br />
//             <br />
//             <asp:Label ID="Label3" runat="server" Text="Email"></asp:Label>
// &nbsp;&nbsp;&nbsp;
//             <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox>
//             <br />
//             <br />
//             <br />
//             <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Submit" />
//             <br />
//             <br />
//             <br />
//             <br />
//             <br />
//             <br />
//             <br />
//             <br />
//         </div>
//     </form>
// </body>
// </html>


// Wf1.aspx.cs code
// using System;
// using System.Collections.Generic;
// using System.Linq;
// using System.Web;
// using System.Web.UI;
// using System.Web.UI.WebControls;

// namespace WebApplication13
// {
//     public partial class WebForm1 : System.Web.UI.Page
//     {
//         protected void Page_Load(object sender, EventArgs e)
//         {
//             Session["name"] = TextBox1.Text;
//         }

//         protected void Button1_Click(object sender, EventArgs e)
//         {
//             Response.Redirect("WebForm2.aspx");
//         }
//     }
// }


// Wf2.aspx code
// <%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm2.aspx.cs" Inherits="WebApplication13.WebForm2" %>

// <!DOCTYPE html>

// <html xmlns="http://www.w3.org/1999/xhtml">
// <head runat="server">
//     <title></title>
// </head>
// <body>
//     <form id="form1" runat="server">
//         <div>
//             <br />
//             <asp:Label ID="Label1" runat="server" Text="Favouritte Book"></asp:Label>
//             <br />
//             <br />
//             <asp:DropDownList ID="DropDownList1" runat="server">
//                 <asp:ListItem>Harry Potter</asp:ListItem>
//                 <asp:ListItem>GOT</asp:ListItem>
//                 <asp:ListItem>Sudha Murty</asp:ListItem>
//                 <asp:ListItem>Clownn</asp:ListItem>
//             </asp:DropDownList>
//             <br />
//             <br />
//             <br />
//             <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Submit" />
// &nbsp;
//             <asp:Button ID="Button2" runat="server" OnClick="Button2_Click" Text="Back" />
//             <br />
//             <br />
//             <br />
//             <br />
//             <br />
//             <br />
//             <br />
//         </div>
//     </form>
// </body>
// </html>

// Wf2.aspx.cs code
// using System;
// using System.Collections.Generic;
// using System.Linq;
// using System.Web;
// using System.Web.UI;
// using System.Web.UI.WebControls;

// namespace WebApplication13
// {
//     public partial class WebForm2 : System.Web.UI.Page
//     {
//         protected void Page_Load(object sender, EventArgs e)
//         {
//             Session["book"] = DropDownList1.SelectedItem;
//         }

//         protected void Button1_Click(object sender, EventArgs e)
//         {
//             Response.Redirect("WebForm3.aspx");

//         }

//         protected void Button2_Click(object sender, EventArgs e)
//         {
//             Response.Redirect("WebForm1.aspx");
            
//         }
//     }
// }


// Wf3.aspx code
// <%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm3.aspx.cs" Inherits="WebApplication13.WebForm3" %>

// <!DOCTYPE html>

// <html xmlns="http://www.w3.org/1999/xhtml">
// <head runat="server">
//     <title></title>
// </head>
// <body>
//     <form id="form1" runat="server">
//         <div>
//             <br />
//             <asp:Label ID="Label1" runat="server" Text="Favourite sports team"></asp:Label>
//             <br />
//             <br />
//             <br />
//             <asp:DropDownList ID="DropDownList1" runat="server">
//                 <asp:ListItem>Ronaldo</asp:ListItem>
//                 <asp:ListItem>messi</asp:ListItem>
//                 <asp:ListItem>Isagi</asp:ListItem>
//                 <asp:ListItem>Mabappe</asp:ListItem>
//             </asp:DropDownList>
//             <br />
//             <br />
// &nbsp;<asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Submit" />
// &nbsp;
//             <asp:Button ID="Button2" runat="server" OnClick="Button2_Click" Text="Back" />
//             <br />
//             <br />
//             <br />
//             <br />
//             <br />
//             <br />
//             <br />
//             <br />
//             <br />
//             <br />
//         </div>
//     </form>
// </body>
// </html>


// Wf3.aspx.cs code
// using System;
// using System.Collections.Generic;
// using System.Linq;
// using System.Web;
// using System.Web.UI;
// using System.Web.UI.WebControls;

// namespace WebApplication13
// {
//     public partial class WebForm3 : System.Web.UI.Page
//     {
//         protected void Page_Load(object sender, EventArgs e)
//         {
//             Session["player"] = DropDownList1.SelectedItem;
//         }

//         protected void Button1_Click(object sender, EventArgs e)
//         {
//             Response.Redirect("WebForm4.aspx");
//         }

//         protected void Button2_Click(object sender, EventArgs e)
//         {
//             Response.Redirect("WebForm2.aspx");

//         }
//     }
// }


// Wf4.aspx code

// <%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm4.aspx.cs" Inherits="WebApplication13.WebForm4" %>

// <!DOCTYPE html>

// <html xmlns="http://www.w3.org/1999/xhtml">
// <head runat="server">
//     <title></title>
// </head>
// <body>
//     <form id="form1" runat="server">
//         <div>
//             <br />
//             <asp:Label ID="Label1" runat="server" Text="thankyou for response"></asp:Label>
//             <br />
//             <br />
// &nbsp;<asp:Label ID="Label5" runat="server" Text="Customer name"></asp:Label>
// &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
//             <asp:Label ID="Label2" runat="server" Text="Label"></asp:Label>
// &nbsp;<br />
//             <br />
//             <br />
//             <asp:Label ID="Label6" runat="server" Text="Book name"></asp:Label>
// &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
//             <asp:Label ID="Label3" runat="server" Text="Label"></asp:Label>
//             <br />
//             <br />
//             <asp:Label ID="Label7" runat="server" Text="Sports person"></asp:Label>
// &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
//             <asp:Label ID="Label4" runat="server" Text="Label"></asp:Label>
//             <br />
//             <br />
//             <br />
//             <br />
//             <br />
//             <br />
//             <br />
//             <br />
//             <br />
//         </div>
//     </form>
// </body>
// </html>

// Wf4.aspx.cs code
// using System;
// using System.Collections.Generic;
// using System.Linq;
// using System.Web;
// using System.Web.UI;
// using System.Web.UI.WebControls;

// namespace WebApplication13
// {
//     public partial class WebForm4 : System.Web.UI.Page
//     {
//         protected void Page_Load(object sender, EventArgs e)
//         {
//             if (Session["name"] != null)
//             {
//                 Label2.Text = Session["name"].ToString();
//             }

//             if (Session["book"] != null)
//             {
//                 Label3.Text= Session["book"].ToString();
//             }

//             if (Session["player"] != null)
//             {
//                 Label4.Text = Session["player"].ToString();
//             }
//         }
//     }
// }