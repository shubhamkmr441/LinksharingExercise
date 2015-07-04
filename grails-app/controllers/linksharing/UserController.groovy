package linksharing

class UserController {
    def scaffold = true


    def register()
    {
        User user = new User()
        bindData(user,params)
        render "Successfull"

    }

}
