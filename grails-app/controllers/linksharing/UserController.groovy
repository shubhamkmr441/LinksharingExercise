package linksharing

class UserController {
    def index(){}


    def register()
    {
        User user = new User()
        bindData(user,params)
        render "Successfull"

    }

}
