<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Email&Password</title>
  </head>
  <body>
    <form action="/hello" autocomplete="on" method="post">
      <hr>
      <table>
        <tr>
          <td>
            Email:
          </td>
          <td>
            <input type="email" name="email">
          </td>
        </tr>
        <tr>
          <td>
            Password:
          </td>
          <td>
            <input type="password" name="password" pattern="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?!.*[0-9]{4,})(?!.*[a-z]{4,})(?!.*[A-Z]{4,})(?!(.)\1{2,})^[\x20-\x7E]*$">
          </td>
        </tr>
      </table>
      <hr>
      <input type="submit" value="Submit">
    </form>
  </body>
</html>
