## gatling-api-load-testing-Framework
API and Load testing using Gatling.

## Prerequisites:
> Install gatling

> Install Java 8 and above and add to environment variable path

> Install Java maven and add to environment variable path

> Install Java scala and add to environment variable path

## Part 1: Standalone gatling (GUI)
> Download gatling and extract to your choice of location
> To open gatling recorder:
> Nav to gatling bin folder > run recorder.bat 
> record your test from a Chrome browser > goto devTool Network> check preserve log, refresh page, record your scenario
> Stop recording and download recorded script as .HAR with content file
> Select HAR Converter form upper right corner
> upload the .Har file into gatling recorder 
> Set all blacklist filter params to (No static resources)
> click Start/ OK button to save the script into:- user-files/simulations folder
> To open gatling:
> Nav to gatling bin folder> run gatling.bat
> Enter 1 > run simulation locally, enter botton
> Enter 0 > Your recorder simulation (e.g: OrangeHmrLogintest), enter btn
> Press enter button 2ce
> The simulation will start running, wait for completion of the execution
> The .html report of the test will be stored in the results folder of your gatling path.
> Open the .html to see your report.

## Part 2: Setup Gatling Maven project:
Prerequisites: JDK, Scala, Maven ( download and add all to env variable path), IDE
> Open Intellij IDE and add scala plugin via File/settings/plugin, restart Intellij
> Add JDK
> Create a Maven Project:
> Create a folder > cmd into the path to the folder > Run command > mvn archetype:generate
> Follow the on-screen instructions on till you see > Green BUILD SUCCESS (Maven project created)
> Open the created folder with intellij ,after opening the project 
> Open the Engine class > (If you see - No Scala SDK in module) then setup Scala SDK to the project by browsing/adding the downloded scala.
> On the project, RtClick on scala folder and select Mark Directory as - Test Sources Root (The folder type)
> Check that When you RtClick again  on scala folder > new > Scala Class/File is present
> On the project, RtClick on src folder and select Mark Directory as - Sources Root (The folder type)
> Run the Engine class to see if all is Good! ( Console Output - There is no simulation script. Please check that your scripts are in user-files/simulations)
> To record your test script:
> record your test from a chrome browser > goto devTool Network> check preserve log, refresh page, record your scenario 
> Stop recording and download recorded script as .HAR with content file to a location
> Open gatling recorder from the project folder:
> RtClick on recorder class > Run recorder class (Gatling recorder opens)
> Select HAR Converter form upper right coner
> upload the .Har file into gatling recorder 
> Set all blacklist filter params to (No static resources)
> click Start/ OK buttons to save the script into:- ./src>test>scala (REFRESH PROJECT IF NOT SEEN)
> (Optional)Open the recorded script and remove all the val headers and their corresponding e.g - .headers(headers_4.header
> Running the test:
> RtClick on Engine Class > Click Run Engine
> Your test script will show on the console output as simulation
> Select run description (Optional) > Press enter button
> Write a test description eg: Run Perf Test  (Enter btn)
> Test will complete & report.htlm will be generated on target folder. BINGO!!!

## Part 3: Gatling recorder in proxy mode:
> Open your recorder GUI (command > recorder.bat)
> Set http proxy from dropdown
> Set port no & generate & select certificate
> Set server/port on your choice of browser (localhost/8080)
> Add/import generated certificate to your browser
> Start your recorder
> Run your site/scenario on the browser (There will be forwarding connection btw your recorder and browser
> Click Stop/Save button
> Import & Run the script with your gatling.bat

## Part 4: Simulation Script:
> Components of simulation script are scenarios, http config and userload, ThinkTime component.

## Part 5: Scenario, Isolation, VUs and ramp up time:
> Record a test script via devTol and save it as .HAR file
> Open gatling recorder from your gatling project framework
> Upload the the test script into the recorder
> Edit the requests to a proper name e.g: homePage, searchPage, editPage etc
> Group the requests into isolated modules: e.g - vals: browse, search, select and edit
> Call the vals (re-usability function):  .exec(browse, search, select, edit) in the val scenario block. (save changes)
> Set up users and user privileges (See code snippets)
> Add ramp up time (See code snippets)
> Run the Engine Class
> Select your simulation number e.g 2
> Issue a run name: e.g perfTest5
> View report on target folder for your simulation. BINGO!!!
> Note: the resolve any indentation errors on intellij > go to code > click aut-indent lines

## Part 6: API Testing with Gatling (GET, POST, PUT, DELETE):
> Add new directory and class in the .com of the project
> extends simulation class (extends Simulation)
> Add import io.gatling.core.Predef._ 
> Add import io.gatling.http.Predef._ 
> Add 3 sections:
protocol (See code snippets)
scenario (See code snippets)
setup (See code snippets)
> Run the Engine Class
> Select your simulation number e.g 2
> Issue a run name: e.g apiTest
> View report on target folder for your simulation. BINGO!!!

Part 7: API Testing with Gatling (POST, PUT, DELETE):
> Add new directory and class in the .com of the project
> extends simulation class (extends Simulation)
> Add import io.gatling.core.Predef._ 
> Add import io.gatling.http.Predef._ 
> Add 3 sections of:
- protocol (See code snippets)
- scenario (See code snippets)
- setup (See code snippets)
> Run the Engine Class
> Select your simulation number e.g 2
> Issue a run name: e.g apiTest
> View report on target folder for your simulation. BINGO!!!

