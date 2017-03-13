CREATE TABLE jenis_beasiswa (
  id VARCHAR(36),
  nama VARCHAR(100) NOT NULL,
  label VARCHAR(255),
  PRIMARY KEY (id),
  UNIQUE (nama)
);

CREATE TABLE jenis_dokumen (
  id VARCHAR(36)
  nama VARCHAR(100) NOT NULL,
  label VARCHAR(255),
  PRIMARY KEY (id),
  UNIQUE (nama)
);
