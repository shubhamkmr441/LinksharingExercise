package linksharing


class User {
    static hasMany = [topics1: Topic, subscriptions1: Subscription, resources1: Resource, readingitems1: ReadingItem, resourceratings1: ResourceRating]
    String email
    String username
    String password
    String confirmPassword
    String firstname
    String lastname
    byte[] photo
    boolean admin = false
    boolean active =false
    Date datecreated
    Date lastupdate


    static constraints = {
        photo(size: 0..5000000)
        email(email: true, nullable: false, blank: false, unique: true)
        username(unique: true, nullable: false)
        password (blank: false,nullable: false, minSize: 8, maxSize: 16, password: true, validator:  {value, object ->
            if (!object.id && value != object.confirmPassword)
                return "user.password.mismatch"
        })
        confirmPassword(nullable: false, password:true)

    }
}
