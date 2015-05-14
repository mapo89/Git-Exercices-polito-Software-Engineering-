# Git-Exercices-polito-Software-Engineering-
Tutorial for using git for Software Engineering course of Politecnico di Torino.
##Preliminary operations
1. create your account on github
2. set up git as explained [here](https://help.github.com/articles/set-up-git/)
3. create a new repository as expained [here](https://help.github.com/articles/create-a-repo/)
4. download a git client ([windows](https://windows.github.com/), on linux and Mac you have it already)
##Exercise 1

###Scenario
You are writing your master thesis and you don't want to keep the history of what done, in order to be able to track modifications and rollback if necessary.

###Main Task
1. Create a new directory and change into it.
2. Use the **init** comm and to create a Git repository in that directory.
3. Observe that there is now a **.git** directory.
4. Create a README file.
5. Look at the output of the **status** command; the README you created should appear as an untracked file.
6. Use the **add** command to add the new file to the staging area. Again, look at the output of the status command.
7. Now use the commit command to commit the contents of the staging area.
8. Create a _Chapters_ directory and add the following files to it: _intro.txt, SoA.txt, method.txt, concl.txt_ 9. Use the **add** command, but name the directory, not the individual files. Use the **status** command. See how files have been staged. Commit them.
10. Make a change to one of the files. Use the *diff* command to view the details of the change.
11. Next, add the changed file, and notice how it moves to the staging area in the status output. Also observe that the **diff** command you did before using add now gives no output. Why not? What do you have to do to see a diff of the things in the staging area?
12. Now – without committing – make another change to the same file you changed in step 10. Look at the status output, and the diff output. Notice how you can have both staged and unstaged changes, even when you’re talking about a single file. Observe the difference when you use the add command to stage the latest round of changes. Finally, commit them. You should now have started to get a  feel for the staging area.
13. Use the log command in order to see all of the commits you made so far.
14. Use the show command to look at an individual commit. How many characters of the commit identifier can you get away with typing at a minimum?
15. Make a couple more commits, at least one of which should add an extra file.

###Stretch Task
1. Use the Git **rm** command to remove a file. Look at the status afterwards. Now commit the deletion.
2. Delete another file, but this time do not use Git to do it; e.g. if you are on Linux, just use the 
normal (non - Git) **rm** command; on Windows use **del**.
3. Look at the status. Compare it to the status output you had after using the Git built-in rm command. Is anything different? After this, commit the deletion.
4. Use the Git **mv** command to move or rename a file; for example, rename README to README.txt. Look at the status. Commit the change.
5. Now do another rename, but this time using the operating system’s command to do so. How does the status look? Will you get the right outcome if you were to commit at this point? Work out how to get the status
to show that it will not lose the file, and then commit. Did Git at any point work out that you had done a 
rename?
6. Use **git help log** to find out how to get Git to display just the most recent 3 commits. Try it.
7. If you don’t remember, look back in the slides to see what the --stat option did on the **diff** command. Find out if this also works with the show command. How about the **log** command?
8. Imagine you want to see a diff that summarizes all that happened between two commit identifiers. Use the 
**diff** command, specifying two commit identifiers joined by two dots (that is, something like abc123..def456). Check the output is what you expect.
