//webform1 CS file

// using System;
// using System.Collections.Generic;
// using System.Linq;
// using System.Web;
// using System.Web.UI;
// using System.Web.UI.WebControls;

// namespace WebApplication14
// {
//     public partial class cross_scripting : System.Web.UI.Page
//     {
//         protected void Page_Load(object sender, EventArgs e)
//         {

//         }

//         protected void Button1_Click(object sender, EventArgs e)
//         {
//             int y = 0;
//             int x = int.Parse(TextBox1.Text);
//             int calc = 0;
//             if (DropDownList1.SelectedValue == "apple")
//             {
//                 y = 10;
//                 calc = x * y;

//             }
//             else if (DropDownList1.SelectedValue == "banana")
//             {
//                 y = 5;
//                 calc = x * y;
//             }
//             else if (DropDownList1.SelectedValue == "orange")
//             {
//                 y = 2;
//                 calc = x * y;
//             }
//             Label3.Text = calc.ToString();
       

          
            
//         }
//     }
// }





//Webform2 CS file

// using System;
// using System.Collections.Generic;
// using System.Linq;
// using System.Web;
// using System.Web.UI;
// using System.Web.UI.WebControls;

// namespace WebApplication14
// {
//     public partial class cross2 : System.Web.UI.Page
//     {
//         protected void Page_Load(object sender, EventArgs e)
//         {
//             Page previous_page = Page.PreviousPage;
//             if(previous_page != null && previous_page.IsCrossPagePostBack)
//             {
//                 Label3.Text = ((Label)previous_page.FindControl("Label3")).Text;
//             }
//             else
//             {
//                 Label3.Text = "what";
//             }
//         }
//     }
// }






//Webform1 aspx file

// <%@ Page Language="C#" AutoEventWireup="true" CodeBehind="cross scripting.aspx.cs" Inherits="WebApplication14.cross_scripting" %>

// <!DOCTYPE html><html xmlns="http://www.w3.org/1999/xhtml"><head runat="server"><title></title></head><body><form id="form1" runat="server">
//          <div>
//             <asp:Label ID="Label1" runat="server" Text="Product"></asp:Label>
//             <asp:DropDownList ID="DropDownList1" runat="server" Height="29px">
//                 <asp:ListItem>Select product</asp:ListItem>
//                 <asp:ListItem>apple</asp:ListItem>
//                 <asp:ListItem>banana</asp:ListItem>
//                 <asp:ListItem>orange</asp:ListItem>
//             </asp:DropDownList>
//         </div>
//         <div>
//             <asp:Label ID="Label2" runat="server" Text="Quantity"></asp:Label>
//             <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
//         </div>
//      <div>
       
//          <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Calculate" PostBackUrl="~/cross2.aspx" />
//          <br />
//          <asp:Label ID="Label3" runat="server" Text=""></asp:Label>
       
//         </div>
//     </form>
// </body>
// </html>