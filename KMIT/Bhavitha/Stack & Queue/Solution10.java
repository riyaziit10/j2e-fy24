/*
10. EVALUATE THE VALUE OF AN ARITHMETIC EXPRESSION IN REVERSE POLISH
NOTATION (RPN). VALID OPERATORS ARE +, -, *, AND /. EACH OPERAND MAY BE AN
INTEGER OR ANOTHER EXPRESSION.
*/
class Solution {
public int evalRPN(String[] tokens) {
Stack<Integer>st=new Stack<>();
for( String e:tokens)
{
if(e.equals("+") || e.equals("-") || e.equals("*") ||
e.equals("/"))
{
int op2=st.pop();
int op1=st.pop();
int res=result(e,op1,op2);
st.push(res);
}
else
{
st.push(Integer.parseInt (e));
}
}
return st.pop();
}
public int result(String e,int op1,int op2)
{
switch(e)
{
case "+":
return op1+op2;
case "-":
return op1-op2;
case "*":
return op1*op2;
case "/":
return op1/op2;
}
return -1;
}
}