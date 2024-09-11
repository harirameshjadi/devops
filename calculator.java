import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class calculator extends applet implements ActionListener
{
string msg=" "
int v1,v2,result;
textfield t1;
button b[]=new button[10];
button add,sub,mul,div,clear,mod,EQ;
char op;
public void init()
{
colour k=new colour(10,89,90);
setbackground(k);
t1=new textfield(50);
gridlayout g1=new gridlayout(6,3);
setlayout(g1);
for(int i=0;i<10;i++)
{
b[i]=new button(" "+i);
}
add=new button("+");
sub=new button("-");
mul=new button("*");
div=new button("/");
mod=new button("%");
clear=new button("clear");
EQ=new button("=");
t1.addActionListener(this);
add(t1);
for(int i=0;i<10;i++)
{
add(b[i]);
}
add(add);
add(sub);
add(mul);
add(div);
add(mod);
add(clear);
add(EQ);
for(int i=0;i<10;i++)
{
b[i].addActionListener(this);
}
add.addActionListener(this);
sub.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
mod.addActionListener(this);
clear.addActionListener(this);
EQ.addActionListener(this);
}
public void actionperformed(actionevent ae)
{
string str=ae.getactioncommand();
char ch=str.charAt(0);
if(character.isdigit(ch))
 t1.settext(t1.gettext()+str);
else
if(str.equals("+")
{
v1=integer.parse int(t1.gettext());
op='+';
t1.settext(" ");
}
elseif(str.equals("-")
{
v1=integer.parse int(t1.gettext());
op='-';
t1.settext(" ");
}

elseif(str.equals("*")
{
v1=integer.parse int(t1.gettext());
op='*';
t1.settext(" ");
}
elseif(str.equals("/")
{
v1=integer.parse int(t1.gettext());
op='/';
t1.settext(" ");
}
elseif(str.equals("%")
{
v1=integer.parse int(t1.gettext());
op='%';
t1.settext(" ");
}
if(str.equals("="))
{
v2=integer.parseint(t1.gettext());
if(op=='+')
result=v1+v2;
elseif(op=='-')
result=v1-v2;
elseif(op=='*')
result=v1*v2;
elseif(op=='/')
result=v1/v2;
elseif(op=='%')
result=v1%v2;
t1.settext(""+result);
}
if(str.equals("clear"))
{
t1.settext(" ");
}
}