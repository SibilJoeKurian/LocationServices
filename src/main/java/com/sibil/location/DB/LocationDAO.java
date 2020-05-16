package com.sibil.location.DB;

import com.sibil.location.DB.utils.LocationMapper;
import com.sibil.location.model.Location;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(LocationMapper.class)
public interface LocationDAO {
    /**
     * Get all locations from database
     * @return
     */
    @SqlQuery ("SELECT * FROM `data`")
    public List<Location> getLocations();

    @SqlQuery("SELECT * FROM `data` where id = :id")
    public Location getLocations(@Bind("id") final int id);

    @SqlUpdate("INSERT INTO `data` (`id`, `code`, `country`, `state`, `type`, `name`, `createdOn`, `modifiedOn`) " +
            "VALUES (:id, :code , :country, :state, :type, :name, :createdOn, :modifiedOn);")
    void insertLocation(@BindBean Location location );
}
