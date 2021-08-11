# fromMyPhone
Purpose of this repository is figure out if it is possible to
Use git from nix or linux terminal that installed at my phone.

So, according to gitdocs firstly you should install 
Git at your terminal for nix use following command: 
  
  nix-env -iA nixpkgs.git

For termux use :
  
  sudo apt update
 
  sudo apt upgrade
  
  sudo apt install git

Next just follow this steps 
https://docs.github.com/en/github/importing-your-projects-to-github/importing-source-code-to-github/adding-an-existing-project-to-github-using-the-command-line

tl;Dr
1) create new repository from browser (don't create additional files like gitignore, readme or license)
2) copy full url like https://github/your_username/your_repo
3) at the project folder call command
  
  git init -b main
4) add all nesessary files to local repo that will be pushed to github in a while
  
  git add .
  5) commit in a usual way 
  
  git commit -m "comment"
  6) now connect your local repo with created at browser
  
  git remote add origin https://
  
  git remote -v
  7) git push
At this step git will asks your for your login and password thats okay.
Don't forget that while you typing password its looks like nothing happens but it is.
 So here we are. 
