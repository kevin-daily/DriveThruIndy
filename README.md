# DriveThruIndy

This repo was created for the TechPoint S.O.S. Challenge for Summer 2020. Below is the description of our vision for the application and an explanation of what can be found in this repo. This app was thought up by and created by Megan D'Silva, Augusta Irechukwu, Kevin Daily, Madison Webb, and Shriyanshi Shikha. We welcome constructive comments and suggestions on what has been built so far, as we plan to continue work on the app after the S.O.S. Challenge is over. 

## Overview

**Tourism** (_noun_, /ˈto͝orˌizəm/): Travel for pleasure or business; also the theory and practice of touring, the business of attracting, accommodating, and entertaining tourists, and the business of operating tours.

**Indianapolis** (_noun_, /ˌɪn.di.əˈnæp.ə.lɪs/): A city rich with history that is home to countless events, filled with plenty of delectable eats, and holds many unique destinations within its reach. Indy definitely takes the cake for being a safe, affordable, and compelling center of activity.

Put those two nouns together and you have some of the best combinations to try and sights to see. Remove one from the other and all of a sudden, things get sticky. Indianapolis without Tourism is like a sunflower without the sun. What was once constantly growing and flourishing is now left to fend for itself as tourism in Indy has dwindled down due to Covid-19. And when there aren’t tourists here, businesses of all kinds start to suffer.

But no fear! Ctrl + S Indy has come up with a solution meant for all. Regardless of whether you’re a tourist or native to the city, an establishment that’s small or large, Drive-Thru Indy is an app that links the people to businesses they long to visit while keeping everyone up-to-date about their safety in the process. But what can **you** do with Drive-Thru Indy? Let us explain!
 
Drive-Thru Indy is a free app that enables you, Hoosiers, and tourists alike to find themed routes to truly explore the many gems of Indianapolis! Businesses that have a destination page on the app will automatically have Mask, Social Distancing, & Cleanliness star ratings. For added peace of mind, there are also Safety percentage ratings. Our goal is to make visiting your (new) favorite spots as effortless and safe as possible. 

## Technical Architecture

![alt text](https://github.com/kevin-daily/DriveThruIndy/blob/master/arch_diag_full.png?raw=true "Application Architectural Diagram")

The above diagram shows a basic architecture for our application. The user interacts with the frontend of the application, which is connected to the class files composing the backend of the app. The class files connect to a Receiver which monitors for events such as entering or exiting the geofence. The Google Maps API is used to generate static images of routes as well as provide navigation. The class files are connected to the database which stores the routes and locations, which can be fed to Google Maps for the navigation of the user chosen route. The answers given by users to the surveys for specific locations are used to make predictions about the safety of locations using machine learning. The predictions are then stored with the corresponding locations in the database and are displayed with the locations when users look at the specific routes and locations. 

Our code can be found at our [GitHub repo](https://github.com/kevin-daily/DriveThruIndy). Because of the short five week deadline, we decided to focus our efforts on the geofencing portion and machine learning portion of the application. The survey portion of the application was created and a single geofence was coded as a proof of concept. The machine learning was coded in Python and can also be found in the GitHub repo. In the final application, these two parts would be integrated into the larger application.

Our Mock-Up Design can be found [here](https://xd.adobe.com/view/15ed004e-d18c-4483-9484-5da8ff57ee3b-40be/?fullscreen) where you can click through the vision of our solution concept.

## If you had another 5 weeks to work on this, what would you do next?

If we had another 5 weeks we would do the following:
1. Collect the survey data of the most recent visits to the restaurants, bars, parks and other public places to be able to predict how safe it is to visit a particular place based on the current user ratings. 
2. Added more features to our app such as the ability to post the most recent pictures of the place by the user, finding nearby parking, and user-submitted routes which would only be published to the app by getting an affordable subscription to the application.
3. Add a badge/sticker/trophy system attached to different actions by the user. If a user-submitted route is selected to be included in the app, a “Contributor” badge would be given to the user for display on their account. Badges could also be given for completing a certain number of routes in the same theme. This would give another reason for account creation, give a further sense of involvement with the app, and encourage the user to return to the app. 
Work to extend the application to iOS so iPhone users can also use the app and to increase the number of users.  
4. In the longer run, we were also planning to collaborate with area restaurants and bars to have a QR code for the menu. This way, once the user enters the location they can scan the QR code and the app would automatically pull up the menu and payment information. This would help with the user check in as well as help maintain social distancing by reducing the interaction between the wait staff and the user. 

## Acknowledgments & Thank Yous

As a team we have a handful of important people we would like to thank who really motivated us to perform our best.

Firstly, our coaches from Edusource, Kendra and Jason Beutler. Kendra and Jason were there for us from helping narrow down our solution topic at the beginning all the way to giving us presentation feedback at the end. They sincerely made it a point to check up on us and give us strong advice & encouragement when we needed it the most. We really appreciate them making the time for us each week without fail regardless of how busy things got.

Next, we’d like to make sure to thank our families and friends who helped us with brainstorming, interviews, user testing, and overall feedback. We know that our solutions wouldn’t be as developed as it is without them. They were also very patient with our busy schedules and really helped us to devote the time needed to complete this challenge. 

Lastly, we want to give a huge thanks to Techpoint and all their team members, guest coaches, and special guests for making this Challenge possible and helping us through every step of the way for it. We really enjoyed & discovered so much in all the sprint meetings, breakout rooms, and additional programming they hosted for us. Without the Techpoint team, this opportunity wouldn’t have been possible and we really value them for their time & effort in creating the S.O.S. Challenge for us.
