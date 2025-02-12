var attempt = 3; // Variable to count number of attempts.
// Below function Executes on click of login button.

function validate() {
  var username = document.getElementById("username").value;
  var password = document.getElementById("password").value;

  var usernameRegEx = /^[a-zA-Z]{5,15}.[a-zA-Z]{5,15}$/;
  var passwordRegEx = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[\W_]).{9,}$/;

  /* ^ (Start of string)
   * ?= is a positive lookahead (ensures a condition without consuming characters).
   * (?=.*[a-z]) (At least one lowercase letter)
   * (?=.*[A-Z]) (At least one uppercase letter)
   * \d matches any digit (0-9).
   * \W matches any non-alphanumeric character (like !@#$%^&*)
   * _ is included separately to allow underscores
   * .{9, } (At least 9 characters)
   * $ (End of string)
   */

  /*   HINT........ */
  if (!usernameRegEx.test(username)) {
    // COMPLETE YOU CHECK.....
    alert("Invalid Username! Please try again! e.g. firstname.lastname");
    return false;
  }

  if (!passwordRegEx.test(password)) {
    // COMPLETE YOU CHECK.....
    alert("Invalid password! Please try again!");
    return false;
  }

  if (username == "adams.apple" && password == "Password#123") {
    alert("Login successfully");
    window.location = "success.html"; // Redirecting to other page.
    return false;
  } else {
    attempt--; // Decrementing by one.

    alert("You have left " + attempt + " attempts.");
    // Disabling fields after 3 attempts.
    if (attempt == 0) {
      document.getElementById("username").disabled = true;
      document.getElementById("password").disabled = true;
      document.getElementById("submit").disabled = true;
      return false;
    }
  }
}

// Below function Executes on click of emailLogin button.
function validateEmail() {
  var emailEntered = document.getElementById("email").value;

  var EmailRegEx = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,3}$/;

  /*   HINT........ */
  if (!EmailRegEx.test(emailEntered)) {
    // COMPLETE YOU CHECK.....
    alert(
      "Invalid Email! Please enter a valid email format (e.g., email@email.com)."
    );
    return false;
  }

  if (emailEntered == "student@atu.ie") {
    alert("This is a valid email address");
    window.location = "home.html"; // Redirecting to other page.
    return false;
  } else {
    attempt--; // Decrementing by one.
    alert("Incorrect Email, You have left " + attempt + " attempt;");
    // Disabling fields after 3 attempts.
    if (attempt == 0) {
      document.getElementById("email").disabled = true;
      document.getElementById("submit").disabled = true;
      return false;
    }
  }
}
