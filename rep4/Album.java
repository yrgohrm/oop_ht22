import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Album {
    private UUID id;
    private String name;
    private Genre genre;
    private List<Song> songs;
    private List<Artist> artists;
    private LocalDate releaseDate;

    public Album(String name, Genre genre, LocalDate releaseDate, List<Song> songs,
            List<Artist> artists) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.genre = genre;
        this.songs = songs;
        this.artists = artists;
        this.releaseDate = releaseDate;

        for (Song s : songs) {
            s.setAlbum(this);
        }

        for (Artist a : artists) {
            a.addAlbum(this);
        }
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "Album [id=" + id + ", name=" + name + ", genre=" + genre + ", songs=" + songs
                + ", artists=" + artists + ", releaseDate=" + releaseDate + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((genre == null) ? 0 : genre.hashCode());
        result = prime * result + ((releaseDate == null) ? 0 : releaseDate.hashCode());
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
        Album other = (Album) obj;
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
        if (genre != other.genre)
            return false;
        if (releaseDate == null) {
            if (other.releaseDate != null)
                return false;
        }
        else if (!releaseDate.equals(other.releaseDate))
            return false;
        return true;
    }

    


}
