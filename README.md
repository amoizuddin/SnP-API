# Salt and Pepper API
Backend API for the Salt n Pepper Recipe Book Application


## Purpose
TODO: CREATE  PURPOSE STATEMENT FOR API
Most recipe book solutions online kinda suck. They're either paid applications which are ugly, full of annoying ads, limit functionality behind paywalls, and aren't good enough to meet the cut.

I want to build an application that is simple and easy to use, beautiful, and effective.

## Requirements
TODO: DEFINE MVP REQUIREMENTS FOR API
TODO: DEFINE OVERALL REQUIREMENTS FOR API
- Users must be able to store recipes in a recipe card
    - A recipe card must have an ingredients portion which can be **scaled up and down** depending on the servings
    - The units the ingredients must be able to be converted
    - There must be a directions section which is numbered step by step instructions on how to assemble the dish
    - Recipe cards must be able to be tagged for filtering and searching
    - Must integrate with a nutrition API to give a per serving calorie and macronutrient estimate.
        - Utilize USDA FoodData Central API to get IDs for ingredients and lookup nutrition data per ID
- Home page must allow for searching of saved recipes.
- Users must be able to login using their emails and have their recipes saved no matter what device they access their account from
MVP:
- A Landing Page with search, implement pagenation
- recipe cards with author, ingredients, directions, back button
- 

## Techstack
TODO: DEFINE SYSTEM DESIGN FOR API
### Frontend 
* Next.js
### Backend:
* Quarkus

### Database
SQL DB - PostgreSQL: 
* Users
    * Authentication / user data
* Recipes
    * Main recipe table
* Ingredients
    * Ingredient database used to add ingredients to a recipe and for nutrition
### Authentication:
* Oauth 2

 