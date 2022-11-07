import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Artist {
    private UUID id;
    private String name;
    private Set<Album> albums;

    public Artist(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.albums = new HashSet<>();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void addAlbum(Album album) {
        this.albums.add(album);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((albums == null) ? 0 : albums.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Artist other = (Artist) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (albums == null) {
            if (other.albums != null)
                return false;
        }
        else if (!albums.equals(other.albums))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Artist [id=" + id + ", name=" + name + ", albums=" + albums.size() + "]";
    }
}
