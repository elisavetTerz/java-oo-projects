package gr.aueb.cf.ch13;

/**
 * The {@link User} class creates <i>users</i>.
 * It contains {@link User#id}, {@link User#firstname}
 * and {@link User#lastname} with <i>mutators</i> methods:
 * {@link #setId(Long)}
 * {@link #setFirstname(String)}
 * {@link #setLastname(String)}
 *
 * @author elisavet
 * @since 0.1
 * @version 2.0
 */

public class User {

    private Long id;
    private String firstname;
    private String lastname;

    /**
     * Initializes a new {@link User}
     * with default values
     */
    public User() {
    }


    /**
     * Initializes a new {@link User}
     * with specific values.
     * @param id , user's id.
     * @param firstname , user's firstname.
     * @param lastname , user's lastname.
     */
    public User(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Gets {@link User#id}.
     * @return the value of id.
     */

    public Long getId() {
        return id;
    }

    /**
     * Sets the {@link User#id}.
     * @param id the value of user's id.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets {@link User#firstname}.
     * @return the value of firstname.
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets {@link User#firstname}.
     * @param firstname the value of firstname.
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Gets {@link User#lastname}.
     * @return the value of lastname.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets {@link User#lastname}.
     * @param lastname the value of lastname.
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Returns the state of {@link User} instance
     * as a {@link String}
     * @return a string representation of {@link User} instance.
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
