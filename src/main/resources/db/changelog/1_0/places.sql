CREATE TABLE IF NOT EXISTS place
(
    uuid varchar NOT NULL,
    type varchar NOT NULL,
    size varchar NOT NULL,
    CONSTRAINT unq_places_uuid UNIQUE (uuid),
    CONSTRAINT pk_places PRIMARY KEY (uuid)
);