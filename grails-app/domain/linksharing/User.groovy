package linksharing


class User {
    static hasMany = [topics1: Topic, subscriptions1: Subscription, resources1: Resource, readingitems1: ReadingItem, resourceratings1: ResourceRating]
    String email
    String username
    String password
    String firstname
    String lastname
    byte photo
    boolean admin
    boolean active
    Date datecreated
    Date lastupdate


    static constraints = {
        email(email: true, nullable: false, blank: false, unique: true)
        username(unique: true, nullable: false)
        password (blank: false,nullable: false )

    }
}
