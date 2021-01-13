# DStudioApp :robot:

A quick demo app based on the designs found here -> https://cdn.dribbble.com/users/1126935/screenshots/14889725/media/d4cfe67aad7749d086dff60df9e34a38.png

## Design Decisions :thinking:

I used MVCVM to architect this, it is quite verbose and some files are empty, though they remain so that the option for future work is simple.

I did some simple tests for one of the screens to demonstrate how I would test it. Given a production environment I would write the tests first (based on requirements) and work from there.

The SignInService is mocked to return not signed in on a fresh spin up of the app and then once you press the login button it will switch to signed in. It will remain this way until you remove the app from your open apps.

I also included a screen to get you to log in if you skip on the first step, you can press back on this screen to get to the homepage again. There weren't any designs for this screen so it is just a placeholder with some text.
