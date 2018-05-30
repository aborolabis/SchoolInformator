<html>
<head>
    <title>School Informator</title>
</head>
<link rel="Stylesheet" type="text/css" href="Style.css" />
<body>

<div class="main">
<h1 class="centre">School informator</h1>
    <br/><div class="centre">
    <img src="https://www.westlothian.gov.uk/media/13044/School-Holidays-Banner/image/school-holidays-banner.jpg" alt="schoolPicture"/><br/><br/>

    <h2>Get information about students in our school.</h2><br/>

    <p>Find all our students: </p>
    <form method="get" action="/app/pupils/all">
        <input type="submit" value="Find">
    </form> <br/>

    <p>Find student by his name: </p>
    <form method="get" action="/app/pupils/findbyname">
        Name of the student: <input type="text" name="name">
        <input type="submit" value="FIND">
    </form><br/>

    <p>Find students from one class:</p>
    <form class="centre" method="get" action="/app/pupils/findbyclass">
        Class number <input type="text" name="classNumber">
        Class letter: <input type="text" name="classLetter">
        <input type="submit" value="FIND">
    </form><br/>

    <p>Get all students in JSON:</p>
    <form method="get" action="/app/pupils/tojson">
        <input type="submit" value="Find">
    </form>
</div>
</div>
</body>
</html>