# Vox Populi
<p align="center">
  ![Logo](/screenshots/logo.png "logo")
</p>

Vox Populi was a web application made at Facebook's Students of Color Hackathon. This site allows users to view news relating to people of color that aren't typically shown in mainstream media. 

Articles are arranged by popularity and levels of discussions and are separated into different categories for the user to browse. The bigger the picture is on the front page, the more popular it is, making it easy for a user to choose a selection based on what has the current most hype. 

![Front Page](/screenshots/front-page.png “Front Page“)

This site is crowd sourced, which mean it heavily relies on user input. Articles are submitted by the user and then analyzed by us to see if it appropriate to put the content on the site. Using parsing we are able to take the links and automatically produce an article page. 

![Article](/screenshots/article.png “article“)

## Backend

We decided to use MongoDB to store our data, and JSoup to parse the HTML information. To parse the articles we used tags to attempt to detect the articles title, author, date, and article text. Using that we stored this information in the MongoDB. Along with the articles being stored, we store the comments and voting feedback in order to know how to organize the front page based off of popularity. 
