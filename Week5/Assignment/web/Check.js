function check() {

    const name = document.getElementsByName("txt-name").value;
    const email = document.getElementsByName("txt-email").value;
    const username = document.getElementsByName("txt-user").value;
    const password = document.getElementsByName("password").value;
    const bm = document.getElementsByName("bm").value;
    const gender = document.getElementsByName("gender").value;
    const statements = [name, email, username, password, bm, gender];

    const forbidenStatements = [null, '<', '>', '=', '|', '&', '%', '?', '!' ];
    let accessDenied = false;
    for(let i = 0; i < statements.length; i++)
    {
        for(let j = 0; j < statements[i].length; j++)
        {
            if(statements[i] == "" || statements == null)
            {
                for (let l = 0; l < forbidenStatements.length; l++)
                {
                    if (statements[i].charAt(j) == forbidenStatements[l]) {
                        accessDenied = true;
                    }
                }
            }
            else
            {
                accessDenied = true;
            }
        }
    }
    if(accessDenied == true)
    {
        document.body.innerHTML = '';
        document.body.innerHTML += "<h1>Acceso denegado, ha introducido un caracter invalido.</h1>";
    }
}

/*if(statements[i].charAt(j) == null || statements[i].charAt(j) == '<'
    || statements[i].charAt(j) == '>' || statements[i].charAt(j) == '='
    || statements[i].charAt(j) == '|' || statements[i].charAt(j) == '&'
    || statements[i].charAt(j) == '%' || statements[i].charAt(j) == '')
{

}
*/
