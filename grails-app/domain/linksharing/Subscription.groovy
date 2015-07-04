package linksharing

class Subscription {
    Topic topic
    User user
    Date datecreated


    static constraints = {
        user( unique: 'topic',  nullable: false)

    }
}
