package ch.peters.daniel.chess.model.pieces;

import ch.peters.daniel.chess.model.Colour;
import ch.peters.daniel.chess.logic.PathTrace;

/**
 * King piece.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class King extends Piece {
  public King(Colour color) {
    super(color);
  }

  @Override
  public PathTrace tracePaths(int sourceX, int sourceY, int destX, int destY) {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
