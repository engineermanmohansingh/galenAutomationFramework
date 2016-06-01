Page Title: Altoro.Mutual

#Object Definitions
====================================================================================

login_Link              css             #_ctl0__ctl0_Content_AccountLink
personal_Link           linktext        PERSONAL
inp_username            id              uid
inp_password            id              passw
btn_signin              xpath           //input[@type='submit']
====================================================================================

@all
--------------------------------
login_Link:
    left-of personal_Link ~10px
personal_Link:
    right-of login_Link ~10px