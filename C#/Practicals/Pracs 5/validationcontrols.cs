
//no cs code




//aspx code
/*<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="WebApplication7.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <br />
            <br />
            <br />
            <asp:Label ID="Label1" runat="server" Text="userid"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
            <asp:RequiredFieldValidator ID="RequiredFieldValidator1"
runat="server"
ControlToValidate="TextBox1"
ErrorMessage="Your userid is empty"

ToolTip="Input Your Name"
Text="(Required)" ForeColor="Red" />
            <asp:RegularExpressionValidator Display = "Dynamic" ControlToValidate = "TextBox1" ID="RegularExpressionValidator3" ValidationExpression = "^[\s\S]{5,8}$" runat="server" ErrorMessage="Minimum 5 and Maximum 8 characters required." ForeColor="Red"/>
            
            <br />
            &nbsp;
            <br />
            <asp:Label ID="Label2" runat="server" Text="PassWord"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <br />
            <br />
            <asp:Label ID="Label3" runat="server" Text="Confirm Pass"></asp:Label>
            <asp:TextBox ID="TextBox3" runat="server" Height="22px" style="margin-left: 28px"></asp:TextBox>
            <asp:CompareValidator ID="CompareValidator1"
runat="server" ControlToCompare="TextBox2"
ControlToValidate="TextBox3"
Type="String"
Operator="Equal"
Text="(Password Not matched)" ForeColor="Red" />
            <br />
            <br />
            <br />
            <asp:Label ID="Label4" runat="server" Text="Name"></asp:Label>
&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox4" runat="server"></asp:TextBox>
            <asp:RequiredFieldValidator ID="namerequired"
runat="server"
ControlToValidate="TextBox4"
ErrorMessage="Your Name is empty"

ToolTip="Input Your Name"
Text="(Required)" ForeColor="Red" />
            <br />
            <br />
            <asp:Label ID="Label5" runat="server" Text="Age"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox5" runat="server" TextMode="Number"></asp:TextBox>
            <asp:RangeValidator ID="RangeValidator1" runat="server"
ControlToValidate="TextBox5"
Type="Integer"
MinimumValue="18"
MaximumValue="60"
Text="(Out of 18-60)"
ToolTip="Input value between 18-60"
ErrorMessage="Out of range(18-60)" ForeColor="Red" />
            <br />
            <br />
            <br />
            <asp:Label ID="Label6" runat="server" Text="Country"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:DropDownList ID="DropDownList1" runat="server">
                <asp:ListItem>India</asp:ListItem>
                <asp:ListItem>Japan</asp:ListItem>
                <asp:ListItem>France</asp:ListItem>
            </asp:DropDownList>
             <asp:RequiredFieldValidator ID="ControlRequired"
runat="server"
ControlToValidate="DropDownList1"
ErrorMessage="No country selected"

ToolTip="Select country"
Text="(Required)" ForeColor="Red" />
            <br />
            <br />
            <br />
            <asp:Label ID="Label7" runat="server" Text="ZipCode"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox6" runat="server"></asp:TextBox>
            <br />
            <asp:RegularExpressionValidator ID="ZipCoderag" ControlToValidate="TextBox6" runat="server" ErrorMessage="Invalid Zip" ValidationExpression="\d{6}(-\d{1})?" ForeColor="Red"></asp:RegularExpressionValidator>
            <br />
            <br />
            <br />
            <asp:Label ID="Label8" runat="server" Text="Email id"></asp:Label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <asp:TextBox ID="TextBox7" runat="server"></asp:TextBox>
             <asp:RequiredFieldValidator ID="EmailRequired"
runat="server"
ControlToValidate="TextBox7"
ErrorMessage="Your Email is empty"

ToolTip="Input Your Email"
Text="(Required)" ForeColor="Red" />
            <asp:RegularExpressionValidator
ID="RegularExpressionValidator1" runat="server"
ControlToValidate="TextBox7"
ValidationExpression=
"\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*"
Text="Invalid EmailID format" ForeColor="Red" />

            <br />
            <br />
            <asp:Label ID="Label9" runat="server" Text="Gender"></asp:Label>
            :<br />
            <br />
            <asp:RadioButtonList ID="RadioButtonList1" runat="server">
                <asp:ListItem>Male</asp:ListItem>
                <asp:ListItem>Female</asp:ListItem>
            </asp:RadioButtonList>
             <asp:RequiredFieldValidator ID="genderreq"
runat="server"
ControlToValidate="RadioButtonList1"
ErrorMessage="Select 1 "

ToolTip="Select your gender"
Text="(Required)" ForeColor="Red" />

            <br />
            <br />
            <br />
            <br />
            <br />
            <br />
            <br />
        </div>
    </form>
</body>
</html>*/