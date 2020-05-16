package com.sibil.location.DB.utils;

import com.sibil.location.Data.Country;
import com.sibil.location.Data.State;
import com.sibil.location.Data.Type;
import com.sibil.location.model.Location;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationMapper implements ResultSetMapper<Location> {

    @Override
    public Location map(int index, ResultSet r, StatementContext ctx) throws SQLException {

        Location location = new Location(
            r.getLong("id"),
          r.getLong( "createdOn"),
          r.getLong("modifiedOn"),
            Country.valueOf(r.getString("country")),
                State.valueOf(r.getString("state")),
                Type.valueOf(r.getString("type")),
                r.getString("code"),
            r.getString("name")
        );
        System.out.println("Printing SOmething"+location.getCode()+location.getCountry());
        return location;
    }
}
