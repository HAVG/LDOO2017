function check()
{
    var name = document.getElementsByName(txt-name).value;
    var email = document.getElementsByName(txt-email).value;
    var username = document.getElementsByName(txt-username).value;
    var whoami = document.getElementsByName(whoami).value;

    name = encodeURI(name);
    email = encodeURI(email);
    username = encodeURI(username);
    whoami = encodeURI(whoami);

    name.innerHTML();
}