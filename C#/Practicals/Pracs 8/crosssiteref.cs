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


