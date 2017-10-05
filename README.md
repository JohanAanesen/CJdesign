# CJdesign
CJ design front-end &amp; back-end source code


What heroku says when I try to deploy:
```
$ git push heroku master
Counting objects: 52, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (46/46), done.
Writing objects: 100% (52/52), 2.82 MiB | 467.00 KiB/s, done.
Total 52 (delta 19), reused 0 (delta 0)
remote: Compressing source files... done.
remote: Building source:
remote:
remote:  !     No default language could be detected for this app.
remote:                         HINT: This occurs when Heroku cannot detect the buildpack to use for this application automatically.
remote:                         See https://devcenter.heroku.com/articles/buildpacks
remote:
remote:  !     Push failed
remote: Verifying deploy...
remote:
remote: !       Push rejected to cjdesign.
remote:
To https://git.heroku.com/cjdesign.git
 ! [remote rejected] master -> master (pre-receive hook declined)
error: failed to push some refs to 'https://git.heroku.com/cjdesign.git'
```
What heroku says when I try to deploy with a preset Buildpack (heroku/go):
```
$ git push heroku master
Counting objects: 52, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (46/46), done.
Writing objects: 100% (52/52), 2.82 MiB | 469.00 KiB/s, done.
Total 52 (delta 19), reused 0 (delta 0)
remote: Compressing source files... done.
remote: Building source:
remote:
remote: -----> App not compatible with buildpack: https://codon-buildpacks.s3.amazonaws.com/buildpacks/heroku/go.tgz
remote:        More info: https://devcenter.heroku.com/articles/buildpacks#detection-failure
remote:
remote:  !     Push failed
remote: Verifying deploy...
remote:
remote: !       Push rejected to cjdesign.
remote:
To https://git.heroku.com/cjdesign.git
 ! [remote rejected] master -> master (pre-receive hook declined)
error: failed to push some refs to 'https://git.heroku.com/cjdesign.git'
```
