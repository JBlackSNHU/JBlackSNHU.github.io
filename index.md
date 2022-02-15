## Professional Self Assessment
Greetings and Salutations! My name is Jessie Black and this is my personal ePortfolio. I will soon be graduating from Southern New Hampshire University (SNHU) with a bachelor's of science in Computer Science with an emphasis in Software Engineering. My degree has focused on a variety of topics that have contributed to an existsing career as a Systems Engineer and that have helped my skill set grow considerably. In the below portfolio, you will find references to a mobile application that cover the three topics of Software Design and Engineering; Algorithms and Data Structures; and Databases. This application was written in Android Studio using Java as the foundation, with an associated Android SQLite Database. In addition to the below application, I use C/C++, C#, Python, and Java on a weekly basis as well as work on SQL Databases and the creation of User Interfaces for our Global IT Asset Management team. My strengths are that I am able to write software in multiple languages as well as work with REST API's, XML/XAML and JSON, and can write customer intefaces for applications in any of these languages. I am able to understand the entire scope of a large project and work with others on a team to complete milestones in such a project while not losing site of the overall requirements. One of the areas that I have grown most in through my coursework at SNHU has been the area of software security. I have found that I still need to develop my skillset and writing secure code, but it is an area that I am looking forward to learning more about as well as  challenging myself to excel.

As the capstone project for the Computer Science program, I chose to enhance and modify a mobile application that I created during the Mobile Architecure and Programming course. The project began as an inventory management application for a warehouse. I chose to modify the application by converting it into a character creation and management app for the Palladium Rifts table top role-playing game. The reason for choosing this as my capstone project is that it incorpates all three categories of Software Design and Engineering; Algorithms and Data Structures; and Databases. I wanted to work on a project where all three of the categories would work together to create a cohesive application and as well as begin work on a project that I could continue in my post-graduate career. With that in mind, the project is by nature incomplete, but what is presented below and included with this ePortfolio can be run in Android Studio and is nearing the release stage for the Google Play Store. Below I being by performing a self-narrated Code Review where I discuss the initial inventory management application, it's functionality, drawbacks and weakneses, and then the planned enhancements for the project.

## Self-narrated Code Review
This is the initial code-review that I performed of the Inventory Management project that I created for the Mobile Architecture and Programming course at SNHU. This review critiques the formatting, logic, and general security of the program as well as outlines my planned enhancements for the application for the capstone project.

<iframe width="560" height="315" src="https://www.youtube.com/embed/PnkeAHXo1ag" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

## Software Design and Engineering
From a software design and engineering perspective, I chose re-design the program following the Model-View-ViewModel design pattern. This seperates the different components of the application into the Model for data structures, View for UI components, and ViewModel to handle interactions between the View and Model. This design pattern stronly relies on databinding between the View and ViewModel which allows for updates to the Model without manual declarations. This 

## Algorithms and Data Structure
For the transition from the inventory manager application to the Rifts Companion application, I implemented multiple new class structures to support different data components that are involved in character creation for the Rifts RPG game. These classes all implement getter/setter functionality for access control

## Databases
The adjustment to the inventory manager application for database structure was relatively straightforward. The number of tables were increased to support the different amounts of data that needed to be accessed by the program at different points in the character creation process. The tables contain significantly larger amounts of data compared to the inventory management program and I ended up creating a Java package with classes and methods dedicated to populating those tables provided they are not updated. 

When the [DBHelper](https://github.com/JBlackSNHU/JBlackSNHU.github.io/blob/master/app/src/main/java/com/example/riftscompanion/DBHelper.java) class is initialized, it first performs a check to see if the different tables currently exist, and then creates them if they have do not. This is done by performing a "CREATE IF EXISTS" query on the database for each table. Below is an example of how the query is structured. 

```java
String skillTableCreateQuery = "CREATE TABLE IF NOT EXISTS " + SKILL_TABLE_NAME + " ("
                + SKILL_ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + SKILL_NAME_COL + " TEXT DEFAULT NULL, "
                + SKILL_DESCRIPTION_COL + " TEXT DEFAULT NULL, "
                + SKILL_CATEGORY_COL + " TEXT DEFAULT NULL,"
                + SKILL_PROFICIENCY_COL + " INT, "
                + SKILL_PROFICIENCY_PER_LEVEL_COL + " INT, "
                + SKILL_SECONDARY_PROFICIENCY_COL + " INT, "
                + SKILL_SECONDARY_PROFICIENCY_PER_LEVEL_COL + " INT, "
                + SKILL_PREREQUISITES_COL + " TEXT DEFAULT NULL, "
                + SKILL_MODIFIER_COL + " TEXT DEFAULT NULL, "
                + SKILL_MODIFIER_VALUE_COL + " INT)";
```

I would point out that each table name, and the column names for each table are static String variables in the DBHelper class. This supports readability of the code and helps to prevent typos in any SQL queries by using the String variables rather than typing them in. 

The program then performs a check on each table to determine if it is empty or contains the data. This is shown in the following code. 

```java
private boolean isTableEmpty(String tableName) {
        SQLiteDatabase db = this.getReadableDatabase();
        boolean retval;
        Cursor cursor = db.rawQuery(String.format("SELECT COUNT(*) FROM %s",tableName), null);
        cursor.moveToFirst();
        if (cursor.getInt(0) == 0)
            retval = true;
        else
            retval = false;

        cursor.close();
        return retval;
    }
```

If the tables are empty, then the data is added to the table using the SQLiteOpenHelper functions using ContentValues and the SQLiteDatabase insert() function. Below is an example of the Skills table being populated using looping through the Skills List.

```java
public void PopulateSkillsTable() {
        SQLiteDatabase db = this.getWritableDatabase();
        SkillsData sd = new SkillsData();

        for (Skill skill : sd.getSkillsList()) {
            ContentValues values = new ContentValues();

            values.put(SKILL_NAME_COL, skill.getSkillName());
            values.put(SKILL_DESCRIPTION_COL, skill.getSkillDescription());
            values.put(SKILL_CATEGORY_COL, skill.getSkillCategory());
            values.put(SKILL_PROFICIENCY_COL, skill.getSkillProficiency());
            values.put(SKILL_PROFICIENCY_PER_LEVEL_COL, skill.getSkillProficiencyPerLevel());
            values.put(SKILL_SECONDARY_PROFICIENCY_COL, skill.getSkillSecondaryProficiency());
            values.put(SKILL_SECONDARY_PROFICIENCY_PER_LEVEL_COL, skill.getSkillSecondaryProficiencyPerLevel());
            values.put(SKILL_PREREQUISITES_COL, skill.getSkillPrerequisites());
            values.put(SKILL_MODIFIER_COL, skill.getSkillModifier());
            values.put(SKILL_MODIFIER_VALUE_COL, skill.getSkillModifierValue());

            db.insert(SKILL_TABLE_NAME, null, values);
        }
    }
```

Lastly, data is accessed from the database using one of two different queries from the application. The first query returns all values contained in the specific table as in the below example for the Skills Table
```java
    public ArrayList<Skill> getDBSkillsList() {
        SQLiteDatabase db = this.getWritableDatabase();
        ArrayList<Skill> skillsList = new ArrayList<>();

        Cursor cursor = db.rawQuery("SELECT * FROM " + SKILL_TABLE_NAME, null);
        int rowCount = cursor.getCount();
        if (cursor.moveToFirst()) {
            do {
                skillsList.add(
                        new Skill(
                                cursor.getInt(0),       // Skill ID
                                cursor.getString(1),    // Skill Name
                                cursor.getString(2),    // Skill Description
                                cursor.getString(3),    // Skill Category
                                cursor.getInt(4),       // Skill Base Proficiency
                                cursor.getInt(5),       // Skill Proficiency Per Level
                                cursor.getInt(6),       // Skill Secondary Base Proficiency
                                cursor.getInt(7),       // Skill Secondary Proficiency Per Level
                                cursor.getString(8),    // Skill Prerequisites (comma delim)
                                cursor.getString(9),    // Skill Modifier
                                cursor.getInt(10)       // Skill Modifier value
                        )
                );
            } while (cursor.moveToNext());
        }
        cursor.close();
        return skillsList;
    }
```

And the second query method is to return one or more entries contained in a comma delimmitted string passed as an argument to the method. This uses the SQL query "IN" method to dynamically select any matching entries for the skillname, but also able to return a single value. 

```java
    public ArrayList<Skill> getPartialDBSkillsList(String skillNames) {
        SQLiteDatabase db = this.getWritableDatabase();
        ArrayList<Skill> skillsList = new ArrayList<>();

        // Reformat the skillNames string to support the IN function of SQL
        String skillNamesFormatted = skillNames.replace(",","','");
        String getSkillsQuery = "SELECT * FROM " + SKILL_TABLE_NAME + " WHERE " + SKILL_NAME_COL + " IN ('" + skillNamesFormatted + "')";
        Cursor cursor = db.rawQuery(getSkillsQuery, null);
        if (cursor.moveToFirst()) {
            do  {
                skillsList.add(
                        new Skill(
                                cursor.getInt(0),       // Skill ID
                                cursor.getString(1),    // Skill Name
                                cursor.getString(2),    // Skill Description
                                cursor.getString(3),    // Skill Category
                                cursor.getInt(4),       // Skill Base Proficiency
                                cursor.getInt(5),       // Skill Proficiency Per Level
                                cursor.getInt(6),       // Skill Secondary Base Proficiency
                                cursor.getInt(7),       // Skill Secondary Proficiency Per Level
                                cursor.getString(8),    // Skill Prerequisites (comma delim)
                                cursor.getString(9),    // Skill Modifier
                                cursor.getInt(10)       // Skill Modifier value
                        )
                );
            } while (cursor.moveToNext());
        }
        cursor.close();
        return skillsList;
    }
```

The above method does not support partial matches, but could easily be modified to support partial match searching of the database. In future versions of this application, such functinonality will be implemented for general search parameters. 

Each of these 


