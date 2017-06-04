Pre requisites:
 *JDK1.7
 -must be in your path
 *Maven
 -must be in your path
 *eclipse (prefered)

Run Instructions:

1.Download Git project
2. Go to project repository
3. run in command line or eclipse->  mvn clean compile assembly:single 
    -this maven comman create the jar file
    -C:\*example*\GitHub\CodingExercise
4. go to directory with jar file
  -should be in target file of project
  -C:\*example*\GitHub\CodingExercise\target
5. run in command line -> java -jar coding-excersice-jar-with-dependencies.jar
Extra feature: 
6. run -> java -jar coding-excersice-jar-with-dependencies.jar --ignore-donuts

C:\Users\aggie\Documents\Eclipse Workspaces\CapitalOneCodeExercise\coding-excersice\target> java -jar coding-excersice-jar-with-dependencies.jar
----------------------User Report Start----------------------------------
{"date":"2014-10","money":{"spent":-15784400,"income":34297900}}
{"date":"2014-11","money":{"spent":-46256700,"income":39495100}}
{"date":"2014-12","money":{"spent":-47857800,"income":39543200}}
{"date":"2015-01","money":{"spent":-38114200,"income":39259800}}
{"date":"2015-02","money":{"spent":-42179900,"income":39366400}}
{"date":"2015-03","money":{"spent":-34601700,"income":39427300}}
{"date":"2015-04","money":{"spent":-29854500,"income":39436800}}
{"date":"2015-05","money":{"spent":-26926700,"income":34164000}}
{"date":"2015-06","money":{"spent":-37584500,"income":39182300}}
{"date":"2015-07","money":{"spent":-39210500,"income":39171800}}
{"date":"2015-08","money":{"spent":-28090300,"income":33848800}}
{"date":"2015-09","money":{"spent":-30555100,"income":39227200}}
{"date":"2015-10","money":{"spent":-33018400,"income":17174300}}
{"date":"2015-11","money":{"spent":-31540400,"income":39777800}}
{"date":"2015-12","money":{"spent":-32085400,"income":17255700}}
{"date":"2016-01","money":{"spent":-28278100,"income":22428900}}
{"date":"2016-02","money":{"spent":-31189100,"income":34513800}}
{"date":"2016-03","money":{"spent":-42165500,"income":33866100}}
{"date":"2016-04","money":{"spent":-39121800,"income":39174000}}
{"date":"2016-05","money":{"spent":-35434600,"income":39911800}}
{"date":"2016-06","money":{"spent":-32762400,"income":39277800}}
{"date":"2016-07","money":{"spent":-32624200,"income":39282300}}
{"date":"2016-08","money":{"spent":-30725300,"income":39223300}}
{"date":"2016-09","money":{"spent":-37202000,"income":22296300}}
{"date":"2016-10","money":{"spent":-32735800,"income":22099100}}
{"date":"2016-11","money":{"spent":-48313200,"income":34418300}}
{"date":"2016-12","money":{"spent":-31061900,"income":39662500}}
{"date":"2017-01","money":{"spent":-41195300,"income":34864800}}
{"date":"2017-02","money":{"spent":-33311000,"income":17076800}}
{"date":"2017-03","money":{"spent":-43574400,"income":34706100}}
{"date":"2017-04","money":{"spent":-48203400,"income":22302900}}
{"date":"2017-05","money":{"spent":-28049700,"income":39461200}}
average: spent: -35300256 income: 33912325
----------------------User Report End------------------------------------
C:\Users\aggie\Documents\Eclipse Workspaces\CapitalOneCodeExercise\coding-excersice\target> java -jar coding-excersice-jar-with-dependencies.jar  --ignore-donuts
----------------------User Report Start----------------------------------
{"date":"2014-10","money":{"spent":-14941600,"income":34297900}}
{"date":"2014-11","money":{"spent":-45911100,"income":39495100}}
{"date":"2014-12","money":{"spent":-46903200,"income":39543200}}
{"date":"2015-01","money":{"spent":-37567300,"income":39259800}}
{"date":"2015-02","money":{"spent":-41592000,"income":39366400}}
{"date":"2015-03","money":{"spent":-33923600,"income":39427300}}
{"date":"2015-04","money":{"spent":-29397900,"income":39436800}}
{"date":"2015-05","money":{"spent":-26705600,"income":34164000}}
{"date":"2015-06","money":{"spent":-37242800,"income":39182300}}
{"date":"2015-07","money":{"spent":-38981400,"income":39171800}}
{"date":"2015-08","money":{"spent":-27873900,"income":33848800}}
{"date":"2015-09","money":{"spent":-30360300,"income":39227200}}
{"date":"2015-10","money":{"spent":-33018400,"income":17174300}}
{"date":"2015-11","money":{"spent":-31350300,"income":39777800}}
{"date":"2015-12","money":{"spent":-31852800,"income":17255700}}
{"date":"2016-01","money":{"spent":-27460400,"income":22428900}}
{"date":"2016-02","money":{"spent":-30826900,"income":34513800}}
{"date":"2016-03","money":{"spent":-42078500,"income":33866100}}
{"date":"2016-04","money":{"spent":-39043900,"income":39174000}}
{"date":"2016-05","money":{"spent":-35054000,"income":39911800}}
{"date":"2016-06","money":{"spent":-32220200,"income":39277800}}
{"date":"2016-07","money":{"spent":-32027100,"income":39282300}}
{"date":"2016-08","money":{"spent":-30152800,"income":39223300}}
{"date":"2016-09","money":{"spent":-36771500,"income":22296300}}
{"date":"2016-10","money":{"spent":-32402800,"income":22099100}}
{"date":"2016-11","money":{"spent":-47984600,"income":34418300}}
{"date":"2016-12","money":{"spent":-30784600,"income":39662500}}
{"date":"2017-01","money":{"spent":-40274600,"income":34864800}}
{"date":"2017-02","money":{"spent":-33159800,"income":17076800}}
{"date":"2017-03","money":{"spent":-43513400,"income":34706100}}
{"date":"2017-04","money":{"spent":-47302800,"income":22302900}}
{"date":"2017-05","money":{"spent":-27648800,"income":39461200}}
average: spent: -34885278 income: 33912325
----------------------User Report End------------------------------------
