Command Line Output

C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator>mvn test
[INFO] Scanning for projects...
[INFO]
[INFO] ------------< com.ontariotechu.sofe3980U:BinaryCalculator >-------------
[INFO] Building BinaryCalculator 1.0.0
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- resources:3.0.2:resources (default-resources) @ BinaryCalculator ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\main\resources
[INFO]
[INFO] --- compiler:3.8.0:compile (default-compile) @ BinaryCalculator ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- resources:3.0.2:testResources (default-testResources) @ BinaryCalculator ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\resources
[INFO]
[INFO] --- compiler:3.8.0:testCompile (default-testCompile) @ BinaryCalculator ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\test-classes
[INFO]
[INFO] --- surefire:2.22.1:test (default-test) @ BinaryCalculator ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.ontariotechu.sofe3980U.AppTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.055 s - in com.ontariotechu.sofe3980U.AppTest
[INFO] Running com.ontariotechu.sofe3980U.BinaryTest
[INFO] Tests run: 20, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in com.ontariotechu.sofe3980U.BinaryTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 24, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.921 s
[INFO] Finished at: 2025-01-27T11:17:52-05:00
[INFO] ------------------------------------------------------------------------

C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator>mvn clean package site assembly:single
[INFO] Scanning for projects...
[INFO]
[INFO] ------------< com.ontariotechu.sofe3980U:BinaryCalculator >-------------
[INFO] Building BinaryCalculator 1.0.0
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- clean:3.1.0:clean (default-clean) @ BinaryCalculator ---
[INFO] Deleting C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target
[INFO]
[INFO] --- resources:3.0.2:resources (default-resources) @ BinaryCalculator ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\main\resources
[INFO]
[INFO] --- compiler:3.8.0:compile (default-compile) @ BinaryCalculator ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\classes
[INFO]
[INFO] --- resources:3.0.2:testResources (default-testResources) @ BinaryCalculator ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\resources
[INFO]
[INFO] --- compiler:3.8.0:testCompile (default-testCompile) @ BinaryCalculator ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\test-classes
[INFO]
[INFO] --- surefire:2.22.1:test (default-test) @ BinaryCalculator ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.ontariotechu.sofe3980U.AppTest
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.05 s - in com.ontariotechu.sofe3980U.AppTest
[INFO] Running com.ontariotechu.sofe3980U.BinaryTest
[INFO] Tests run: 20, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in com.ontariotechu.sofe3980U.BinaryTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 24, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- jar:3.0.2:jar (default-jar) @ BinaryCalculator ---
[INFO] Building jar: C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\BinaryCalculator-1.0.0.jar
[INFO]
[INFO] --- site:3.7.1:site (default-site) @ BinaryCalculator ---
[INFO] configuring report plugin org.apache.maven.plugins:maven-javadoc-plugin:3.4.1
[INFO] preparing maven-javadoc-plugin:javadoc report requires 'generate-sources' forked phase execution
[INFO]
[INFO] >>> javadoc:3.4.1:javadoc > generate-sources @ BinaryCalculator >>>
[INFO]
[INFO] <<< javadoc:3.4.1:javadoc < generate-sources @ BinaryCalculator <<<
[INFO]
[INFO] 'generate-sources' forked phase execution for maven-javadoc-plugin:javadoc report preparation done
[INFO] preparing maven-javadoc-plugin:test-javadoc report requires 'generate-test-sources' forked phase execution
[INFO]
[INFO] >>> javadoc:3.4.1:test-javadoc > generate-test-sources @ BinaryCalculator >>>
[INFO]
[INFO] --- resources:3.0.2:resources (default-resources) @ BinaryCalculator ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\main\resources
[INFO]
[INFO] --- compiler:3.8.0:compile (default-compile) @ BinaryCalculator ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] <<< javadoc:3.4.1:test-javadoc < generate-test-sources @ BinaryCalculator <<<
[INFO]
[INFO] 'generate-test-sources' forked phase execution for maven-javadoc-plugin:test-javadoc report preparation done
[INFO] 6 reports detected for maven-javadoc-plugin:3.4.1: aggregate-no-fork, javadoc, javadoc-no-fork, test-aggregate-no-fork, test-javadoc, test-javadoc-no-fork
[INFO] configuring report plugin org.apache.maven.plugins:maven-surefire-report-plugin:3.0.0-M7
[INFO] preparing maven-surefire-report-plugin:report report requires '[surefire]test' forked phase execution
[INFO]
[INFO] >>> surefire-report:3.0.0-M7:report > [surefire]test @ BinaryCalculator >>>
[INFO]
[INFO] --- resources:3.0.2:resources (default-resources) @ BinaryCalculator ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\main\resources
[INFO]
[INFO] --- compiler:3.8.0:compile (default-compile) @ BinaryCalculator ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- resources:3.0.2:testResources (default-testResources) @ BinaryCalculator ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\resources
[INFO]
[INFO] --- compiler:3.8.0:testCompile (default-testCompile) @ BinaryCalculator ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- surefire:2.22.1:test (default-test) @ BinaryCalculator ---
[INFO] Skipping execution of surefire because it has already been run for this configuration
[INFO]
[INFO] <<< surefire-report:3.0.0-M7:report < [surefire]test @ BinaryCalculator <<<
[INFO]
[INFO] '[surefire]test' forked phase execution for maven-surefire-report-plugin:report report preparation done
[INFO] 3 reports detected for maven-surefire-report-plugin:3.0.0-M7: failsafe-report-only, report, report-only
[INFO] configuring report plugin org.apache.maven.plugins:maven-project-info-reports-plugin:3.0.0
[INFO] 15 reports detected for maven-project-info-reports-plugin:3.0.0: ci-management, dependencies, dependency-info, dependency-management, distribution-management, index, issue-management, licenses, mailing-lists, modules, plugin-management, plugins, scm, summary, team
[INFO] Rendering site with default locale English (en)
[INFO] Relativizing decoration links with respect to localized project URL: http://www.example.com
[INFO] Rendering content with org.apache.maven.skins:maven-default-skin:jar:1.2 skin.
[INFO] Skipped "Javadoc" report (maven-javadoc-plugin:3.4.1:javadoc), file "apidocs/index.html" already exists.
[INFO] Skipped "Javadoc" report (maven-javadoc-plugin:3.4.1:javadoc-no-fork), file "apidocs/index.html" already exists.
[INFO] Skipped "Test Javadoc" report (maven-javadoc-plugin:3.4.1:test-javadoc), file "testapidocs/index.html" already exists.
[INFO] Skipped "Test Javadoc" report (maven-javadoc-plugin:3.4.1:test-javadoc-no-fork), file "testapidocs/index.html" already exists.
[INFO] Skipped "Surefire Report" report (maven-surefire-report-plugin:3.0.0-M7:report-only), file "surefire-report.html" already exists.
[INFO] Generating "Javadoc" report       --- maven-javadoc-plugin:3.4.1:aggregate-no-fork
[INFO] No previous run data found, generating javadoc.
[WARNING] Javadoc Warnings
[WARNING] Loading source file C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\main\java\com\ontariotechu\sofe3980U\App.java...
[WARNING] Loading source file C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\main\java\com\ontariotechu\sofe3980U\Binary.java...
[WARNING] Loading source files for package com.ontariotechu.sofe3980U...
[WARNING] Constructing Javadoc information...
[WARNING] Building index for all the packages and classes...
[WARNING] Standard Doclet version 21.0.6+8-LTS-188
[WARNING] Building tree for all the packages and classes...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\apidocs\com\ontariotechu\sofe3980U\App.html...
[WARNING] C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\main\java\com\ontariotechu\sofe3980U\App.java:9: warning: use of default constructor, which does not provide a comment
[WARNING] public class App
[WARNING] ^
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\apidocs\com\ontariotechu\sofe3980U\Binary.html...
[WARNING] C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\main\java\com\ontariotechu\sofe3980U\Binary.java:120: warning: no comment
[WARNING] public static Binary and(Binary num1, Binary num2) {
[WARNING] ^
[WARNING] C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\main\java\com\ontariotechu\sofe3980U\Binary.java:139: warning: no comment
[WARNING] public static Binary multiply(Binary num1, Binary num2) {
[WARNING] ^
[WARNING] C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\main\java\com\ontariotechu\sofe3980U\Binary.java:99: warning: no comment
[WARNING] public static Binary or(Binary num1, Binary num2) {
[WARNING] ^
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\apidocs\com\ontariotechu\sofe3980U\package-summary.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\apidocs\com\ontariotechu\sofe3980U\package-tree.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\apidocs\com\ontariotechu\sofe3980U\class-use\Binary.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\apidocs\com\ontariotechu\sofe3980U\class-use\App.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\apidocs\com\ontariotechu\sofe3980U\package-use.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\apidocs\overview-tree.html...
[WARNING] Building index for all classes...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\apidocs\allclasses-index.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\apidocs\allpackages-index.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\apidocs\index-all.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\apidocs\search.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\apidocs\index.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\apidocs\help-doc.html...
[WARNING] 4 warnings
[INFO] Generating "Test Javadoc" report  --- maven-javadoc-plugin:3.4.1:test-aggregate-no-fork
[INFO] Configuration changed, re-generating javadoc.
[WARNING] Javadoc Warnings
[WARNING] Loading source file C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\java\com\ontariotechu\sofe3980U\AppTest.java...
[WARNING] Loading source file C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\java\com\ontariotechu\sofe3980U\BinaryTest.java...
[WARNING] Loading source files for package com.ontariotechu.sofe3980U...
[WARNING] Constructing Javadoc information...
[WARNING] Building index for all the packages and classes...
[WARNING] Standard Doclet version 21.0.6+8-LTS-188
[WARNING] Building tree for all the packages and classes...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\testapidocs\com\ontariotechu\sofe3980U\AppTest.html...
[WARNING] C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\java\com\ontariotechu\sofe3980U\AppTest.java:9: warning: use of default constructor, which does not provide a comment
[WARNING] public class AppTest
[WARNING] ^
[WARNING] C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\java\com\ontariotechu\sofe3980U\AppTest.java:32: warning: no comment
[WARNING] public void appAndTest()
[WARNING] ^
[WARNING] C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\java\com\ontariotechu\sofe3980U\AppTest.java:42: warning: no comment
[WARNING] public void appMultiplyTest()
[WARNING] ^
[WARNING] C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\java\com\ontariotechu\sofe3980U\AppTest.java:22: warning: no comment
[WARNING] public void appOrTest()
[WARNING] ^
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\testapidocs\com\ontariotechu\sofe3980U\BinaryTest.html...
[WARNING] C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\java\com\ontariotechu\sofe3980U\BinaryTest.java:9: warning: use of default constructor, which does not provide a comment
[WARNING] public class BinaryTest
[WARNING] ^
[WARNING] C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\java\com\ontariotechu\sofe3980U\BinaryTest.java:154: warning: no comment
[WARNING] public void andTest1()
[WARNING] ^
[WARNING] C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\java\com\ontariotechu\sofe3980U\BinaryTest.java:164: warning: no comment
[WARNING] public void andTest2()
[WARNING] ^
[WARNING] C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\java\com\ontariotechu\sofe3980U\BinaryTest.java:174: warning: no comment
[WARNING] public void andTest3()
[WARNING] ^
[WARNING] C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\java\com\ontariotechu\sofe3980U\BinaryTest.java:185: warning: no comment
[WARNING] public void multiplyTest1()
[WARNING] ^
[WARNING] C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\java\com\ontariotechu\sofe3980U\BinaryTest.java:195: warning: no comment
[WARNING] public void multiplyTest2()
[WARNING] ^
[WARNING] C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\java\com\ontariotechu\sofe3980U\BinaryTest.java:205: warning: no comment
[WARNING] public void multiplyTest3()
[WARNING] ^
[WARNING] C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\java\com\ontariotechu\sofe3980U\BinaryTest.java:123: warning: no comment
[WARNING] public void orTest1()
[WARNING] ^
[WARNING] C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\java\com\ontariotechu\sofe3980U\BinaryTest.java:133: warning: no comment
[WARNING] public void orTest2()
[WARNING] ^
[WARNING] C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\src\test\java\com\ontariotechu\sofe3980U\BinaryTest.java:143: warning: no comment
[WARNING] public void orTest3()
[WARNING] ^
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\testapidocs\com\ontariotechu\sofe3980U\package-summary.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\testapidocs\com\ontariotechu\sofe3980U\package-tree.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\testapidocs\com\ontariotechu\sofe3980U\class-use\AppTest.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\testapidocs\com\ontariotechu\sofe3980U\class-use\BinaryTest.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\testapidocs\com\ontariotechu\sofe3980U\package-use.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\testapidocs\overview-tree.html...
[WARNING] Building index for all classes...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\testapidocs\allclasses-index.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\testapidocs\allpackages-index.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\testapidocs\index-all.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\testapidocs\search.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\testapidocs\index.html...
[WARNING] Generating C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\site\testapidocs\help-doc.html...
[WARNING] 14 warnings
[INFO] Generating "Surefire Report" report --- maven-surefire-report-plugin:3.0.0-M7:report
[WARNING] Unable to locate Test Source XRef to link to - DISABLED
[INFO] Generating "Dependencies" report  --- maven-project-info-reports-plugin:3.0.0:dependencies
[INFO] Generating "Dependency Information" report --- maven-project-info-reports-plugin:3.0.0:dependency-info
[INFO] Generating "About" report         --- maven-project-info-reports-plugin:3.0.0:index
[INFO] Generating "Plugin Management" report --- maven-project-info-reports-plugin:3.0.0:plugin-management
[INFO] Generating "Plugins" report       --- maven-project-info-reports-plugin:3.0.0:plugins
[INFO] Generating "Summary" report       --- maven-project-info-reports-plugin:3.0.0:summary
[INFO]
[INFO] --- assembly:3.7.1:single (default-cli) @ BinaryCalculator ---
[INFO] Building jar: C:\Users\shane\OneDrive\Documents\Lab1 - Maven\BinaryCalculator\target\BinaryCalculator-1.0.0-jar-with-dependencies.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11.635 s
[INFO] Finished at: 2025-01-27T11:19:08-05:00
[INFO] ------------------------------------------------------------------------
